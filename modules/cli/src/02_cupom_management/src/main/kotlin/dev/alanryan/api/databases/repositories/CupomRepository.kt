package dev.alanryan.api.databases.repositories

import dev.alanryan.api.databases.entities.CupomEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CupomRepository : JpaRepository<CupomEntity, UUID> {
    fun findByCode(code: String): CupomEntity?
}
