package com.hennangadelha.marketbook.database.repository

import com.hennangadelha.marketbook.core.models.book.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookRepository : JpaRepository<Book, UUID> {
}