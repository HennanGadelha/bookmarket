package com.hennangadelha.marketbook.database.service

import com.hennangadelha.marketbook.core.mapper.CustomerConverter
import com.hennangadelha.marketbook.core.port.customer.CustomerRepositoryPort
import com.hennangadelha.marketbook.database.model.customer.CustomerEntity
import com.hennangadelha.marketbook.database.repository.CustomerRepository

class CustomerRepositoryService(val customerRepository: CustomerRepository): CustomerRepositoryPort {

    override fun customer(customerEntity: CustomerEntity) {
        customerRepository.save(CustomerConverter.customerEntityToCustomer(customerEntity))
    }


}