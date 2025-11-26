package com.personalproject.plugins

import com.personalproject.routes.getAllHeroes
import com.personalproject.routes.root
import com.personalproject.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.*
import javax.naming.AuthenticationException

fun Application.configureRouting() {
    routing {
        root()
        getAllHeroes()
        searchHeroes()

//        //Test exception
//        get("/test1") {
//            throw AuthenticationException()
//        }
        staticResources("/images", "images")
    }
}
