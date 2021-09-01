package com.hennangadelha.marketbook.core.mapper

import com.hennangadelha.marketbook.core.models.book.Book
import com.hennangadelha.marketbook.database.model.book.BookEntity
import com.hennangadelha.marketbook.entrypoint.dto.book.BookRequest
import com.hennangadelha.marketbook.entrypoint.dto.book.BookResponse

class BookConverter {

    companion object{

        fun toBook(bookEntity: BookEntity) =
            Book(bookEntity.name, bookEntity.description ,bookEntity.price, bookEntity.status)

        fun toBookEntity(book: Book) =
            BookEntity(book.id,book.name, book.description ,book.price, book.status)

        fun bookRequestToBook(request: BookRequest) =
            Book(request.name, request.description ,request.price, request.status)

        fun toBookResponse(request: BookRequest) = BookResponse(request.name, request.description ,request.price, request.status)
    }


}