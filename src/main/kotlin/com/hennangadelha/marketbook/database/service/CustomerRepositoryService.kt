package com.hennangadelha.marketbook.database.service

import com.hennangadelha.marketbook.core.mapper.CustomerConverter
import com.hennangadelha.marketbook.core.models.customer.Customer
import com.hennangadelha.marketbook.core.port.customer.CustomerRepositoryPort
import com.hennangadelha.marketbook.database.model.customer.CustomerEntity
import com.hennangadelha.marketbook.database.repository.CustomerRepository
import org.springframework.stereotype.Component

@Component
class CustomerRepositoryService(val customerRepository: CustomerRepository): CustomerRepositoryPort {



    override fun create(customerEntity: CustomerEntity): Customer {
        return customerRepository.save(CustomerConverter.customerEntityToCustomer(customerEntity))
    }


}