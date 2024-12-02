package com.tryouts.gamification

import com.tryouts.gamification.model.Member
import io.quarkus.test.junit.QuarkusTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import java.util.UUID

@QuarkusTest
class ZiqniIntegrationTest {
    @Inject
    lateinit var stompWebSocketService: StompWebSocketService

    @Test
    fun `should post event to ziqni`() {
        // Given
        val member = Member(
            memberRefId = "test-ml-user" + UUID.randomUUID(),
            name = "John Doe",
        )

        // When & Then
        assertDoesNotThrow { stompWebSocketService.sendMessage(member) }
    }
}
