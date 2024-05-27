package com.example.modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ke2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ke2)
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.R_btn_1)
        button.setOnClickListener {
            val intent = Intent(this@ke2, ke5::class.java)
            startActivity(intent)
        }
    }
}