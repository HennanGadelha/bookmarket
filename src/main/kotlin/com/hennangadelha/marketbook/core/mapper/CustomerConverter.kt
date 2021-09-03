package com.hennangadelha.marketbook.core.mapper

import com.hennangadelha.marketbook.core.models.customer.Customer
import com.hennangadelha.marketbook.database.model.customer.CustomerEntity
import com.hennangadelha.marketbook.entrypoint.dto.customer.CustomerRequest
import com.hennangadelha.marketbook.entrypoint.dto.customer.CustomerResponse

class CustomerConverter {


    companion object{

        fun customerEntityToCustomer(customerEntity: CustomerEntity) =
            Customer(customerEntity.name, customerEntity.email, customerEntity.cpf)

        fun customerToCustomerEntity(customerEntity: Customer) =
            CustomerEntity(customerEntity.id,customerEntity.name, customerEntity.email, customerEntity.cpf)

        fun customerRequestToCustomer(request: CustomerRequest) =
            Customer(request.name, request.email, request.cpf)

        fun toCustomerResponse(customer: Customer) =
            CustomerResponse(customer.id, customer.name, customer.email, customer.cpf)
    }


}