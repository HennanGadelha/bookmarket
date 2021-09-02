package com.hennangadelha.marketbook.entrypoint.dto.customer

import java.util.*

data class CustomerResponse(val id: UUID, val name: String, val email: String, val cpf: String)
