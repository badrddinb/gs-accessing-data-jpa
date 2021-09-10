package com.example.gsaccessingdatajpa.controller

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import com.example.gsaccessingdatajpa.service.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController("/customer")
class CustomerController(
    val customerService: CustomerService
) {
    @GetMapping("{customerId}")
    fun getCustomerById(@PathVariable("customerId") customerId: Long): ResponseEntity<Optional<CustomerEntity>> {
        return ResponseEntity.ok(customerService.getById(customerId))
    }

    @PostMapping("{customerId}")
    fun createCustomer(@RequestBody customerRequest: CustomerEntity): ResponseEntity<CustomerEntity> {
        return ResponseEntity.ok(customerService.createCustomer(customerRequest))
    }
}