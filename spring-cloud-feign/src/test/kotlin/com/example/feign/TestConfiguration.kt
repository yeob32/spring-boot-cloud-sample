package com.example.feign

import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@EnableFeignClients
@ComponentScan(basePackages = ["com.example.feign"])
@Configuration
class TestConfiguration