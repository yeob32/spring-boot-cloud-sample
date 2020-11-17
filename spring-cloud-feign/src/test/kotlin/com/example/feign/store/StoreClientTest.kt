package com.example.feign.store

import com.example.feign.TestSupport
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.test.context.TestConstructor

@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
internal class StoreClientTest(
        val storeClient: StoreClient
) : TestSupport() {

    @Test
    internal fun `클라이언트 호출`() {
        val store = storeClient.getStore();

        println("store : $store")
        assertThat(store).isEqualTo("store!!!")

        val stores = storeClient.getStores()
        println(stores)

        assertThat(stores.size).isEqualTo(2)
        assertThat(stores[0].id).isEqualTo(1)
        assertThat(stores[1].id).isEqualTo(2)
        assertThat(stores[0].name).isEqualTo("store1")
    }
}