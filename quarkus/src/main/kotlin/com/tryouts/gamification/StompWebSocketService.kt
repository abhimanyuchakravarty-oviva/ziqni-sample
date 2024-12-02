package com.tryouts.gamification

import com.tryouts.gamification.admin.AdminApiClientConfiguration
import io.github.oshai.kotlinlogging.KotlinLogging
import jakarta.enterprise.context.ApplicationScoped
import org.springframework.messaging.converter.MappingJackson2MessageConverter
import org.springframework.messaging.simp.stomp.StompHeaders
import org.springframework.messaging.simp.stomp.StompSession
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter
import org.springframework.web.socket.client.standard.StandardWebSocketClient
import org.springframework.web.socket.messaging.WebSocketStompClient
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

@ApplicationScoped
class StompWebSocketService(private val configuration: AdminApiClientConfiguration) {

    companion object {
        private val logger = KotlinLogging.logger {}
        private const val EVENTS_API = "/aapi/createEvents"
    }

    fun <T> sendMessage(message: T) {
        logger.info { "Sending message: $message" }

        val webSocketClient = StandardWebSocketClient()
        val stompClient = WebSocketStompClient(webSocketClient)

        stompClient.messageConverter = MappingJackson2MessageConverter()

        val connectFuture = CompletableFuture<StompSession>()

        try {
            stompClient.connectAsync(
                "wss://${configuration.server.host}/ws",
                object : StompSessionHandlerAdapter() {
                    override fun afterConnected(session: StompSession, connectedHeaders: StompHeaders) {
                        connectFuture.complete(session)
                    }

                    override fun handleTransportError(session: StompSession, exception: Throwable) {
                        logger.error(exception) { "Error while handling transport" }
                        connectFuture.completeExceptionally(exception)
                    }
                },
                StompHeaders().apply {
                    login = configuration.auth.apiKey
                    passcode = configuration.auth.apiKey
                },
            )

            val stompSession = connectFuture.orTimeout(10, TimeUnit.SECONDS).get()

            val sendHeaders = StompHeaders().apply { destination = EVENTS_API }

            stompSession.send(sendHeaders, message)

            logger.info { "Message sent to the WebSocket server" }
        } catch (e: Exception) {
            logger.error(e) { "Error while connecting to the WebSocket server" }
            throw e
        }
    }
}
