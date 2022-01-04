package com.example.dim_space_team

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val playerBtn = findViewById<Button>(R.id.button_start)

        playerBtn.setOnClickListener{
            val intent = Intent(this, WainRoom::class.java)
            startActivity(intent)
        }
    }
}