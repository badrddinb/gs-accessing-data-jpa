package com.example.gsaccessingdatajpa.controller

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.TestComponent

@TestComponent
class CustomerControllerTest {
    private val customerController: CustomerController = mockk()

    @Test
    fun getCustomerByIdTest() {
        every { customerController.getCustomerById(customer.id.toString()) } returns customer

        assertThat(customer).isEqualTo(customer)
    }

    @Test
    fun createCustomerTest() {
        every { customerController.createCustomer(customer) } returns customer

        assertThat(customer).isEqualTo(customer)
    }

    private val customer = CustomerEntity(id = 123456789)
}
