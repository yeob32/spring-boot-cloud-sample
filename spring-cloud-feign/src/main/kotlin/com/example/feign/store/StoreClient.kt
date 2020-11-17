package com.example.feign.store

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "stores", url = "http://localhost:8080", configuration = [StoreConfiguration::class])
interface StoreClient {

    @GetMapping("/store")
    fun getStore(): String

    @GetMapping("/stores")
    fun getStores(): List<Store>

    @GetMapping(value = ["/stores/{storeId}"], consumes = ["application/json"])
    fun update(@PathVariable("storeId") storeId: Long, store: Store): Store
}