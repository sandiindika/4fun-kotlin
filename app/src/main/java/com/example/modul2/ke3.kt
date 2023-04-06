package com.example.modul2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ke3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ke3)
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.L_btn_1)
        button.setOnClickListener {
            val intent = Intent(this@ke3, ke7::class.java)
            startActivity(intent)
        }
    }
}