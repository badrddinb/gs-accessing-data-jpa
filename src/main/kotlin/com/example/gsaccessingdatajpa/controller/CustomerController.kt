package com.example.gsaccessingdatajpa.controller

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import com.example.gsaccessingdatajpa.service.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
    val customerService: CustomerService
) {
    @GetMapping("{customerId}", produces = ["application/json"])
    fun getCustomerById(@PathVariable customerId: String): CustomerEntity {
        return customerService.getById(customerId.toLong())
    }

    @PostMapping("{customerId}", consumes = ["application/json"], produces = ["application/json"])
    fun createCustomer(@RequestBody customerRequest: CustomerEntity): CustomerEntity {
        return customerService.createCustomer(customerRequest)
    }
}
