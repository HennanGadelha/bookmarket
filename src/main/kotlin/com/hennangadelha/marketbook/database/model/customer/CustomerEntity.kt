package com.hennangadelha.marketbook.database.model.customer

import java.util.*

data class CustomerEntity(
    val id: UUID,
    val name: String,
    val email: String,
    val cpf: String
)
