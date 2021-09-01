package com.hennangadelha.marketbook.core.port.book

import com.hennangadelha.marketbook.core.models.book.Book

interface BookServicePort {

    fun create(book: Book)

}