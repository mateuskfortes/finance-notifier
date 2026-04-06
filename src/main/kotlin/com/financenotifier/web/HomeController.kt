package com.financenotifier.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime

@Controller
class HomeController {

    @GetMapping("/")
    fun home(model: Model): String {
        model.addAttribute("title", "Finance Notifier")
        model.addAttribute("message", "Hello World! Esta e a pagina web do projeto.")
        model.addAttribute("generatedAt", LocalDateTime.now())
        return "index"
    }
}
