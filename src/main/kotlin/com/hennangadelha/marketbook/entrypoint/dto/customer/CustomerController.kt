package com.hennangadelha.marketbook.entrypoint.dto.customer

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController {


    @GetMapping
    fun teste(): String = "hjh"


}