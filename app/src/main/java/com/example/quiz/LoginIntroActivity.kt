package com.example.quiz

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz.databinding.ActivityLoginBinding
import com.example.quiz.databinding.ActivityLoginIntroBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class LoginIntroActivity :  AppCompatActivity() {
    private lateinit var binding: ActivityLoginIntroBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginIntroBinding.inflate(layoutInflater)
        auth = Firebase.auth
        auth = FirebaseAuth.getInstance()
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

