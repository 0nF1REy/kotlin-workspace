package dev.alanryan.api.dtos

data class StatusResponse(
    val status: String,
    val message: String,
    val version: String
)
