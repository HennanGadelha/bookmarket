package com.hennangadelha.marketbook.entrypoint.controller.customer

import com.hennangadelha.marketbook.core.mapper.CustomerConverter
import com.hennangadelha.marketbook.core.port.customer.CustomerServicePort
import com.hennangadelha.marketbook.entrypoint.dto.customer.CustomerRequest
import com.hennangadelha.marketbook.entrypoint.dto.customer.CustomerResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customers")
class CustomerController(val customerServicePort: CustomerServicePort) {


    @PostMapping
    fun create(@RequestBody request: CustomerRequest) : ResponseEntity<CustomerResponse> {

        val customer = customerServicePort.create(CustomerConverter.customerRequestToCustomer(request))
        val customerResponse = CustomerConverter.toCustomerResponse(customer)

        return ResponseEntity<CustomerResponse>(customerResponse, HttpStatus.CREATED)

    }


}