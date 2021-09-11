package com.example.gsaccessingdatajpa.repository

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.TestComponent
import java.util.*

@TestComponent
class CustomerRepositoryTest {
    private val customerRepository: CustomerRepository = mockk()

    @Test
    fun findByIdTest() {
        every { customerRepository.getById(123456789) } returns customer

        assertThat(customer.id).isEqualTo(123456789)
    }

    @Test
    fun saveTest() {
        every { customerRepository.save(customer) } returns customer

        assertThat(customer.id).isEqualTo(123456789)
    }

    private val customer = CustomerEntity(id = 123456789)
}