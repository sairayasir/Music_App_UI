package com.example.secondapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MusicScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_screen)

        //find the button with email or phone
        val emailPhoneButton = findViewById<Button>(R.id.buttonWithEP)


        //set OnClickListener for the button
        emailPhoneButton.setOnClickListener {

            //navigate to the sign up screen
            val intent = Intent(this, SignUpScreen::class.java)
            startActivity(intent)
        }

    }

    //<!-- function when user click on login -->

    fun onLoginClick(view: View) {

        //this will navigate to the login screen here
        val intent = Intent(this, LoginScreen::class.java)
        startActivity(intent)
    }
}