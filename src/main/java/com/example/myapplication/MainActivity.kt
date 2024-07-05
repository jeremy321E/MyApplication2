package com.example.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gradeInput: EditText = findViewById(R.id.gradeInput)
        val checkButton: Button = findViewById(R.id.checkButton)
        val resultText: TextView = findViewById(R.id.resultText)

        checkButton.setOnClickListener {
            val grade = gradeInput.text.toString().toIntOrNull()

            if (grade != null) {
                if (grade >= 70) {
                    resultText.text = "¡Felicidades! Aprobaste el examen."
                } else {
                    resultText.text = "Lo siento, reprobaste el examen."
                }
            } else {
                resultText.text = "Por favor, ingrese una calificación válida."
            }
        }
    }
}