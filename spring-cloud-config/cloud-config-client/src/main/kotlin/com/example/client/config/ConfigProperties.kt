package com.example.client.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "custom")
class ConfigProperties (val message: String = "")