// SecondActivity.java
package com.example.myapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.aula0410.MainActivity3

class SecondActivity : AppCompatActivity() {
    var editTextNumber2: EditText? = null
    var buttonOk2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        buttonOk2 = findViewById<Button>(R.id.buttonOk2)

        val num1 = intent.getStringExtra("NUM1")

        buttonOk2.setOnClickListener(View.OnClickListener { // Pega o valor do segundo número
            val num2 = editTextNumber2.getText().toString()

            // Passa ambos os valores para a ThirdActivity
            val intent = Intent(
                this@SecondActivity,
                MainActivity3::class.java
            )
            intent.putExtra("NUM1", num1)
            intent.putExtra("NUM2", num2)
            startActivity(intent)
        })
    }
}