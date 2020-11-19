package com.example.client.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RefreshScope
class ConfigApi {

    @Autowired
    private lateinit var configProperties: ConfigProperties

    @GetMapping("/config")
    fun getConfig(): ResponseEntity<Any> {
        return ResponseEntity.ok(configProperties.message)
    }
}