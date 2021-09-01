package com.hennangadelha.marketbook.core.service.book

import com.hennangadelha.marketbook.core.mapper.BookConverter
import com.hennangadelha.marketbook.core.models.book.Book
import com.hennangadelha.marketbook.core.port.book.BookRepositoryPort
import com.hennangadelha.marketbook.core.port.book.BookServicePort
import org.springframework.stereotype.Component

@Component
class BookServiceImpl(val bookRepositoryPort: BookRepositoryPort) : BookServicePort {

    //    override fun create(book: Book): Book = bookRepository.create(book)
    override fun create(book: Book) {
       bookRepositoryPort.create(BookConverter.toBookEntity(book))
    }


}