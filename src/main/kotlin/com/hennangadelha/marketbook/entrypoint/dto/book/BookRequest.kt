package com.hennangadelha.marketbook.entrypoint.dto.book

import com.hennangadelha.marketbook.core.models.book.BookStatus
import com.hennangadelha.marketbook.core.models.customer.Customer
import java.math.BigDecimal
import javax.persistence.EnumType
import javax.persistence.Enumerated


data class BookRequest(
    val name: String,
    val description: String,
    val price: BigDecimal,
    @Enumerated(EnumType.STRING)
    val status: BookStatus?
)
