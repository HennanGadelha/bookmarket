package com.hennangadelha.marketbook.database.service

import com.hennangadelha.marketbook.core.mapper.BookConverter
import com.hennangadelha.marketbook.core.port.book.BookRepositoryPort
import com.hennangadelha.marketbook.database.model.book.BookEntity
import com.hennangadelha.marketbook.database.repository.BookRepository
import org.springframework.stereotype.Component

@Component
class BookRepositoryService(val bookRepository: BookRepository): BookRepositoryPort {


    override fun create(book: BookEntity) {
        bookRepository.save(BookConverter.toBook(book))
    }


}