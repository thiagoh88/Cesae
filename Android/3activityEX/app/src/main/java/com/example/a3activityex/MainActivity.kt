package com.example.a3activityex

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.a3activityex.R
import com.example.myapplication.SecondActivity


class MainActivity : AppCompatActivity() {
    private lateinit var editTextNumber1: EditText
    private lateinit var buttonOk1: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById(R.id.editTextNumber1)
        buttonOk1 = findViewById(R.id.buttonOk1)

        buttonOk1.setOnClickListener {
            // Pega o valor do primeiro número
            val num1 = editTextNumber1.text.toString()

            // Passa o valor para a SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NUM1", num1)
            startActivity(intent)
        }
    }
}
