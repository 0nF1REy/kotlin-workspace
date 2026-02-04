package dev.alanryan.api.dtos

import java.util.UUID

data class CupomDto(
    val id: UUID,
    val code: String,
    val owner: String,
    val clicks: Int,
)
