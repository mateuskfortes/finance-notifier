package com.financenotifier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinanceNotifierApplication

fun main(args: Array<String>) {
    runApplication<FinanceNotifierApplication>(*args)
}
