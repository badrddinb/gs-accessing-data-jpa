package com.example.gsaccessingdatajpa.service

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.TestComponent

@TestComponent
class CustomerServiceTest {
    private var customerServiceMockk: CustomerService = mockk()

    @Test
    fun getByIdTest() {
        every { customerServiceMockk.getById(123456789) } returns customer

        assertThat(customer.id).isEqualTo(123456789)
    }

    @Test
    fun createCustomerTest() {
        every { customerServiceMockk.createCustomer(customer) } returns customer

        assertThat(customer.id).isEqualTo(123456789)
    }

    private val customer = CustomerEntity(id = 123456789)
}
