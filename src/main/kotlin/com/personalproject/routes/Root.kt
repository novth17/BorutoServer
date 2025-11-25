package com.personalproject.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.response.*


fun Route.root() {
    get(path = "/"){
        call.respond(
            message = "Welcome to Boruto API",
            status = HttpStatusCode.OK
        )
    }
}

