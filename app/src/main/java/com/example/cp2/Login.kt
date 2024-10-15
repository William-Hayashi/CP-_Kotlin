package com.example.cp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            // Tentei usar o intent mas aparentemente não funcionou
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
