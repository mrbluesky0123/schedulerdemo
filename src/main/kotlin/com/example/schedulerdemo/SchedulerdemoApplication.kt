package com.example.schedulerdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class SchedulerdemoApplication

fun main(args: Array<String>) {
    runApplication<SchedulerdemoApplication>(*args)
}
