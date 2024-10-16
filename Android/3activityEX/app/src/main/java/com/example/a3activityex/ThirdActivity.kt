package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.a3activityex.R

class ThirdActivity : AppCompatActivity() {
    private lateinit var textViewResults: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        textViewResults = findViewById(R.id.textViewResults)

        // Pega os valores das Activities anteriores
        val num1 = intent.getStringExtra("NUM1")?.toIntOrNull() ?: 0
        val num2 = intent.getStringExtra("NUM2")?.toIntOrNull() ?: 0

        // Calcula os resultados
        val sum = num1 + num2
        val diff = num1 - num2
        val product = num1 * num2
        val division = if (num2 != 0) num1.toDouble() / num2 else "Infinito"

        // Exibe os resultados no formato "4+5=9"
        val results = """
            $num1 + $num2 = $sum
            $num1 - $num2 = $diff
            $num1 * $num2 = $product
            $num1 / $num2 = $division
        """.trimIndent()

        textViewResults.text = results
    }
}
