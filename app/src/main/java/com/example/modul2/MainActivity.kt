package com.example.modul2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val button = findViewById<Button>(R.id.btn_1)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, ke3::class.java)
            startActivity(intent)
        }
        val bt = findViewById<Button>(R.id.btn_3)
        bt.setOnClickListener {
            val intent = Intent(this@MainActivity, ke2::class.java)
            startActivity(intent)
        }

        val bt1 = findViewById<Button>(R.id.btn_2)
        bt1.setOnClickListener {
            val intent = Intent(this@MainActivity, ke4::class.java)
            startActivity(intent)
        }

        val bt2 = findViewById<Button>(R.id.btn_4)
        bt2.setOnClickListener {
            val intent = Intent(this@MainActivity, ke6::class.java)
            startActivity(intent)
        }

    }
}