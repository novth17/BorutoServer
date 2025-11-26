package com.personalproject.routes

import com.personalproject.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.Route
import io.ktor.server.routing.application
import io.ktor.server.routing.get
import org.koin.ktor.ext.inject
import io.ktor.server.response.*

fun Route.searchHeroes() {

    val heroRepository: HeroRepository by application.inject()

    get("/boruto/heroes/search") {
       val name = call.request.queryParameters["name"]

       val apiResponse = heroRepository.searchHeroes(name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}