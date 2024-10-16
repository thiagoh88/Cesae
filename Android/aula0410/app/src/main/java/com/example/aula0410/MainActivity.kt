
package com.example.myapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.aula0410.MainActivity2

class MainActivity : AppCompatActivity() {
    var editTextNumber1: EditText? = null
    var buttonOk1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        buttonOk1 = findViewById<Button>(R.id.buttonOk1)

        buttonOk1.setOnClickListener(View.OnClickListener { // Pega o valor do primeiro número
            val num1 = editTextNumber1.getText().toString()

            // Passa o valor para a SecondActivity
            val intent = Intent(
                this@MainActivity,
                MainActivity2::class.java
            )
            intent.putExtra("NUM1", num1)
            startActivity(intent)
        })
    }
}