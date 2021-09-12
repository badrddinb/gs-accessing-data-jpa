package com.example.gsaccessingdatajpa.service

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import com.example.gsaccessingdatajpa.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {
    fun getById(id: Long): CustomerEntity = customerRepository.getById(id)
    fun createCustomer(customer: CustomerEntity) = customerRepository.save(customer)
}
