// ThirdActivity.java
package com.example.myapplication

import android.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    var textViewResults: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        textViewResults = findViewById<TextView>(R.id.textViewResults)

        // Pega os valores das Activities anteriores
        val num1 = intent.getStringExtra("NUM1")
        val num2 = intent.getStringExtra("NUM2")

        // Converte para números inteiros
        val number1 = num1!!.toInt()
        val number2 = num2!!.toInt()

        // Calcula os resultados
        val sum = number1 + number2
        val diff = number1 - number2
        val product = number1 * number2
        val division = number1 / number2.toDouble()

        // Exibe os resultados no formato "4+5=9"
        val results = """$number1 + $number2 = $sum
$number1 - $number2 = $diff
$number1 * $number2 = $product
$number1 / $number2 = $division"""

        textViewResults.setText(results)
    }
}