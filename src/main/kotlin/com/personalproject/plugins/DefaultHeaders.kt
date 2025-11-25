package com.personalproject.plugins

import io.ktor.http.HttpHeaders
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

import kotlin.time.Duration

fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.parse("365d").inWholeSeconds
        header (
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable")
    }
}