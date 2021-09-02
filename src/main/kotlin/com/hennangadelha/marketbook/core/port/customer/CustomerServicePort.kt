package com.hennangadelha.marketbook.core.port.customer

import com.hennangadelha.marketbook.core.models.customer.Customer

interface CustomerServicePort {

    fun create(customer: Customer)
}