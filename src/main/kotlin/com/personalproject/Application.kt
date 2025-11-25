package com.personalproject

import com.personalproject.plugins.configureDefaultHeader
import com.personalproject.plugins.configureKoin
import com.personalproject.plugins.configureMonitoring
import com.personalproject.plugins.configureRouting
import com.personalproject.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {

    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureDefaultHeader()
}
