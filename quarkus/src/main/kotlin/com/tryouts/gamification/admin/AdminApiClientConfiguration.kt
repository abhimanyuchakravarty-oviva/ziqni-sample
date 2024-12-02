package com.tryouts.gamification.admin

import io.smallrye.config.ConfigMapping
import io.smallrye.config.WithName

@ConfigMapping(prefix = "admin.client")
interface AdminApiClientConfiguration {
    interface Auth {
        @get:WithName("realm")
        val realm: String

        @get:WithName("resource")
        val resource: String

        @get:WithName("api.key")
        val apiKey: String
    }

    interface Server {
        @get:WithName("host")
        val host: String

        @get:WithName("port")
        val port: Int

        @get:WithName("scheme")
        val scheme: String
    }

    @get:WithName("auth")
    val auth: Auth

    @get:WithName("server")
    val server: Server
}
