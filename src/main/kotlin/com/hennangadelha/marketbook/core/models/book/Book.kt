package com.hennangadelha.marketbook.core.models.book

import com.hennangadelha.marketbook.core.models.customer.Customer
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
class Book(
    val name: String,
    val description: String,
    val price: BigDecimal,
    @Enumerated(EnumType.STRING)
    val status: BookStatus?,

) {

    @Id
    val id: UUID = UUID.randomUUID()
    val registeredIn: LocalDateTime = LocalDateTime.now()


}