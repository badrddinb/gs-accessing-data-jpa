package com.example.gsaccessingdatajpa.repository

import com.example.gsaccessingdatajpa.entity.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<CustomerEntity, Long>