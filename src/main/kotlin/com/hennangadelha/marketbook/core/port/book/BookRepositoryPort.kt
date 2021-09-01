package com.hennangadelha.marketbook.core.port.book

import com.hennangadelha.marketbook.database.model.book.BookEntity


interface BookRepositoryPort {

    fun create(book: BookEntity)

}