package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.a3activityex.R
import com.example.myapplication.ThirdActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var editTextNumber2: EditText
    private lateinit var buttonOk2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        editTextNumber2 = findViewById(R.id.editTextNumber2)
        buttonOk2 = findViewById(R.id.buttonOk2)

        val num1 = intent.getStringExtra("NUM1")

        buttonOk2.setOnClickListener {
            // Pega o valor do segundo número
            val num2 = editTextNumber2.text.toString()

            // Passa ambos os valores para a ThirdActivity
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NUM1", num1)
            intent.putExtra("NUM2", num2)
            startActivity(intent)
        }
    }
}
