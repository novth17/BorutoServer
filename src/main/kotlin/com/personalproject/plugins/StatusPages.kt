package com.personalproject.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import javax.naming.AuthenticationException

fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) {
            call.respond(
                message = "Page Not Found",
                status = HttpStatusCode.NotFound
            )
        }
        //catch exception here
//        exception <AuthenticationException> { call , cause ->
//            println(cause.message)
//            call.respond(
//                message = "We caught an exception!",
//                status = HttpStatusCode.OK
//            )
//        }
    }
}