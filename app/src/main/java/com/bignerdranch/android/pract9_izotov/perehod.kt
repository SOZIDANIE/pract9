package com.bignerdranch.android.pract9_izotov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class perehod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod2)
        val button4 = findViewById<Button>(R.id.b4)
        button4.setOnClickListener { callActivitykrug() }
    }
    private fun callActivitykrug(){
        val intent = Intent(this, result_krug :: class.java)
        startActivity(intent)
    }
}