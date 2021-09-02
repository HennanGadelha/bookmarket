package com.hennangadelha.marketbook.database.repository

import com.hennangadelha.marketbook.core.models.customer.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository :JpaRepository<Customer, UUID> {
}