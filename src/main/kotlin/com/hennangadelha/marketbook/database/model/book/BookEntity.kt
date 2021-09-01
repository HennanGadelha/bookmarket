package com.hennangadelha.marketbook.database.model.book

import com.hennangadelha.marketbook.core.models.book.BookStatus
import com.hennangadelha.marketbook.core.models.customer.Customer
import java.math.BigDecimal
import java.util.*


data class BookEntity(val id: UUID,
                      val name: String,
                      val description: String,
                      val price: BigDecimal,
                      val status: BookStatus?,

)