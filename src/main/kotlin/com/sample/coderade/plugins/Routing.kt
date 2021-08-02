package com.sample.coderade.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
                call.respondText("""Application created using <a href="https://start.ktor.io/"> Ktor Project Generator</a>""", ContentType.Text.Html)
            }
    }
}
