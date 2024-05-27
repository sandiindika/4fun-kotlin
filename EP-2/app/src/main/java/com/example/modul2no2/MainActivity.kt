package com.example.modul2no2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var coba: ArrayList<cobare>
    private lateinit var adapterre: Adapterre
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        recyclerView= findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        coba = ArrayList()

        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))
        coba.add(cobare(R.drawable.rc,"bunga"))


        adapterre = Adapterre(coba)
        recyclerView.adapter = adapterre

    }
}