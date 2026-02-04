package dev.alanryan.api.controllers

import dev.alanryan.api.dtos.StatusResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@RestController
class StatusController(
    @Value("\${app.name}") val appName: String,
    @Value("\${app.version}") val appVersion: String
) {

    @GetMapping("/")
    fun redirectToStatus(): RedirectView {
        return RedirectView("/api/status")
    }

    @GetMapping("/status")
    fun healthCheck(): StatusResponse {
        return StatusResponse(
            status = "UP",
            message = "Welcome to the $appName",
            version = appVersion
        )
    }
}
