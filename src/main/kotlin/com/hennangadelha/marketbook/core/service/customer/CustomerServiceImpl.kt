package com.hennangadelha.marketbook.core.service.customer

import com.hennangadelha.marketbook.core.mapper.CustomerConverter
import com.hennangadelha.marketbook.core.models.customer.Customer
import com.hennangadelha.marketbook.core.port.customer.CustomerRepositoryPort
import com.hennangadelha.marketbook.core.port.customer.CustomerServicePort
import com.hennangadelha.marketbook.database.repository.CustomerRepository
import org.springframework.stereotype.Component

@Component
class CustomerServiceImpl(val customerRepositoryPort: CustomerRepositoryPort): CustomerServicePort {

    override fun create(customer: Customer) {
        customerRepositoryPort.create(CustomerConverter.customerToCustomerEntity(customer))
    }


}