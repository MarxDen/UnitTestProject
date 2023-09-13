package com.example.unittestproject

//Rechtsklick auf Klasse -> Generate -> Test
object RegistrationUtil {
    private val existingUsers = listOf("Peter", "Carl")

    fun validateRegistraionInput(
        username: String,
        password: String,
        confPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password.length < 7 || confPassword.length < 7) {
            return false
        }
        if (password != confPassword) {
            return false
        }
        return true
    }
}