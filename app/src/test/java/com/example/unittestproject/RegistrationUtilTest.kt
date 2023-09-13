package com.example.unittestproject


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "Dennis",
            "12345678",
            "12345678"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirm password dont match returns false` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "Peter",
            "123",
            "321"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password must be at least 7 chars long returns false` () {
        val result = RegistrationUtil.validateRegistraionInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
}