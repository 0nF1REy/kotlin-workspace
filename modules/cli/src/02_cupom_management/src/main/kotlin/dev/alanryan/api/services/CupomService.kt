package dev.alanryan.api.services

import dev.alanryan.api.databases.entities.CupomEntity
import dev.alanryan.api.databases.repositories.CupomRepository
import dev.alanryan.api.dtos.CupomDto
import org.springframework.stereotype.Service

@Service
class CupomService(
    private val repository: CupomRepository
) {

    private val domain = "https://alan-ryan.vercel.app"

    fun click(code: String): String {
        val entity = repository.findByCode(code)
        return entity?.let {
            entity.clicks += 1
            repository.save(entity)
            "$domain/${entity.id}"
        } ?: domain
    }

    fun fetch(code: String): CupomDto? {
        val entity = repository.findByCode(code)

        return entity?.let {
            return CupomDto(
                id = it.id!!,
                code = it.code,
                owner = it.owner,
                clicks = it.clicks
            )
        }
    }

    fun register(code: String, owner: String): CupomDto {
        val entity = CupomEntity(
            code = code.trim(),
            owner = owner.trim(),
            clicks = 0
        )
        val savedEntity = repository.save(entity)

        return CupomDto(
            id = savedEntity.id!!,
            code = savedEntity.code,
            owner = savedEntity.owner,
            clicks = savedEntity.clicks
        )
    }
}
