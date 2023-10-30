package com.example.secondapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        val loginButton =
            findViewById<Button>(R.id.buttonLogin)
        val emailEditText =
            findViewById<EditText>(R.id.editTextEmail)
        val passwordEditText =
            findViewById<EditText>(R.id.editTextPassword)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                val message = "Email: $email \nPassword:$password"
                showToast(message)
            }

            else {
                showToast("please enter both email and password")
            }

        }

    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }
}