package com.personalproject.models

import kotlinx.serialization.Serializable

//This class can be:
//converted to JSON (sent to clients)
//created from JSON (received from clients)
//nested in other JSON objects
//stored or logged as JSON
//responded in Ktor endpoints
@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)
