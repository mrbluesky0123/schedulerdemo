package com.example.schedulerdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val demoService: DemoService) {

    @GetMapping("/test")
    fun getDemoService() {
        demoService.service()
    }

}