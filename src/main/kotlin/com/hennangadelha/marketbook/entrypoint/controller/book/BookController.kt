package com.hennangadelha.marketbook.entrypoint.controller.book

import com.hennangadelha.marketbook.core.mapper.BookConverter
import com.hennangadelha.marketbook.core.port.book.BookServicePort
import com.hennangadelha.marketbook.entrypoint.dto.book.BookRequest
import com.hennangadelha.marketbook.entrypoint.dto.book.BookResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/books")
class BookController(val bookService: BookServicePort) {


    @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: BookRequest): ResponseEntity<BookResponse> {

        bookService.create(BookConverter.bookRequestToBook(request))
        return ResponseEntity<BookResponse>(BookConverter.toBookResponse(request), HttpStatus.CREATED)
    }

}