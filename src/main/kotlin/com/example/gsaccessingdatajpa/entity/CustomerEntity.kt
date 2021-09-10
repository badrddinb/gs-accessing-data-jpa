package com.example.gsaccessingdatajpa.entity

import org.hibernate.Hibernate
import java.time.Instant
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class CustomerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val username: String? = null,
    val email: String? = null,
    val emailToRevalidate: String? = null,
    val systemName: String? = null,
    val billingAddressId: Long? = null,
    val shippingAddressId: Long? = null,
    val customerGuid: String? = null,
    val adminComment: String? = null,
    val isTaxExpected: Boolean? = null,
    val affiliateId: Long? = null,
    val vendorId: Long? = null,
    val hasShoppingCardItems: Boolean? = null,
    val requireReLogin: Boolean? = null,
    val failedLoginAttempts: Int? = null,
    val cannotLoginUntilDateUTC: Instant? = null,
    val active: Boolean? = null,
    val deleted: Boolean? = null,
    val isSystemAccount: Boolean? = null,
    val lastIpAddress: String? = null,
    val createdOnUTC: Instant? = null,
    val lastLoginDateUTC: Instant? = null,
    val lastActiveDateUTC: Instant? = null,
    val registeredInStoreId: Long? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as CustomerEntity

        return id == other.id
    }

    override fun hashCode(): Int = 0

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , username = $username , email = $email , emailToRevalidate = $emailToRevalidate , systemName = $systemName , billingAddressId = $billingAddressId , shippingAddressId = $shippingAddressId , customerGuid = $customerGuid , adminComment = $adminComment , isTaxExpected = $isTaxExpected , affiliateId = $affiliateId , vendorId = $vendorId , hasShoppingCardItems = $hasShoppingCardItems , requireReLogin = $requireReLogin , failedLoginAttempts = $failedLoginAttempts , cannotLoginUntilDateUTC = $cannotLoginUntilDateUTC , active = $active , deleted = $deleted , isSystemAccount = $isSystemAccount , lastIpAddress = $lastIpAddress , createdOnUTC = $createdOnUTC , lastLoginDateUTC = $lastLoginDateUTC , lastActiveDateUTC = $lastActiveDateUTC , registeredInStoreId = $registeredInStoreId )"
    }
}