package com.personalproject.routes

import com.personalproject.models.ApiResponse
import com.personalproject.repository.HeroRepository
import io.ktor.http.HttpStatusCode
import io.ktor.server.routing.*
import io.ktor.server.response.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes() {
    //create instance  auto find hero imp specify in koinmodule, inject implement
    val heroRepository: HeroRepository by application.inject()

    get("/boruto/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1 //default page is 1
            require(page in 1..5)

            val apiResponse = heroRepository.getAllHeroes(page = page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch(e: NumberFormatException) {
            call.respond(
                message = ApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(success = false, message = "Heroes Not Found"),
                status = HttpStatusCode.NotFound
            )
//        } catch (e: Exception) {
//        e.printStackTrace() // <-- Print the stack trace to the console
//        call.respond(
//            message = ApiResponse(success = false, message = "IIIIIIIInternal Server Error: ${e.message}"),
//            status = HttpStatusCode.InternalServerError
//        )
    }


    }
}