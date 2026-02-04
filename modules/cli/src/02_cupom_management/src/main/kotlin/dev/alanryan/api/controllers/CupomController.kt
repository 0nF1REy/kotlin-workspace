package dev.alanryan.api.controllers

import dev.alanryan.api.dtos.CupomDto
import dev.alanryan.api.dtos.CupomRequest
import dev.alanryan.api.services.CupomService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class CupomController(
    private val service: CupomService,
) {

    @PostMapping("/register")
    fun post(@RequestBody cupom: CupomRequest): CupomDto {
//        return CupomDto(id = "123", code = cupom.code, owner = cupom.owner, clicks = 120)
        return service.register(cupom.code, cupom.owner)
    }

    @GetMapping("/{code}")
    fun fetch(@PathVariable code: String): CupomDto? {
        return service.fetch(code)
    }

    @GetMapping("/click/{code}")
    fun click(@PathVariable code: String): ResponseEntity<Void> {
        val url = service.click(code)
        return ResponseEntity.status(HttpStatus.FOUND)
            .header(HttpHeaders.LOCATION,url)
            .build()
    }
}
