package com.hennangadelha.marketbook.core.port.customer

import com.hennangadelha.marketbook.core.models.customer.Customer
import com.hennangadelha.marketbook.database.model.customer.CustomerEntity

interface CustomerRepositoryPort {

    fun create(customerEntity: CustomerEntity) : Customer

}