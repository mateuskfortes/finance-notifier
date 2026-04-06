package com.financenotifier.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/api")
class HelloApiController {

    @GetMapping("/hello")
    fun hello(): Map<String, String> {
        return mapOf(
            "message" to "Hello World from API!",
            "timestamp" to LocalDateTime.now().toString()
        )
    }
}
