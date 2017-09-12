package com.bol.swaggertest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/customer")
    fun test() = Customer("ID", "NAME")
}