package com.hennangadelha.marketbook.entrypoint.dto.book

import com.hennangadelha.marketbook.core.models.book.BookStatus
import java.math.BigDecimal
import java.util.*


data class BookResponse(

    val name: String,
    val description: String,
    val price: BigDecimal,
    val status: BookStatus?
)
