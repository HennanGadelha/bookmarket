package com.hennangadelha.marketbook.core.models.customer

import org.hibernate.validator.constraints.br.CPF
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer(val name: String, val email: String, val cpf: String) {

    @Id
    val id: UUID = UUID.randomUUID()
}