package com.example.feign.store

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StoreApi {

    @GetMapping("/store")
    fun getStore(): String = "store!!!"

    @GetMapping("/stores")
    fun getStores(): List<Store> {
        val store1 = Store(1L, "store1")
        val store2 = Store(2L, "store2")

        return arrayListOf(store1, store2)
    }
}