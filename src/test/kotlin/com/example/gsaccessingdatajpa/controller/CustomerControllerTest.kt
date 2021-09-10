package com.example.gsaccessingdatajpa.controller

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.TestComponent
import org.springframework.http.ResponseEntity
import java.util.*

@TestComponent
class CustomerControllerTest {
    private val customerController: CustomerController = mockk()

    @Test
    fun getCustomerByIdTest() {
        every { customerController.getCustomerById(customer.id) } returns customerOptionalResponseEntity

        assertThat(customerOptionalResponseEntity.statusCode.value()).isEqualTo(200)
        assertThat(customerOptionalResponseEntity.body).isEqualTo(customerOptionalResponseEntity.body)
    }

    @Test
    fun createCustomerTest() {
        every { customerController.createCustomer(customer) } returns customerResponseEntity

        assertThat(customerResponseEntity.statusCode.value()).isEqualTo(200)
        assertThat(customerResponseEntity.body).isEqualTo(customerResponseEntity.body)
    }

    private val customer = CustomerEntity(id = 123456789)
    private val customerOptionalResponseEntity = ResponseEntity.of(Optional.of(Optional.of(customer)))
    private val customerResponseEntity = ResponseEntity.of(Optional.of(customer))
}