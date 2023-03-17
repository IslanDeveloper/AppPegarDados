package com.softworldtechnologies.aprendizagem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextPegarDados = findViewById<EditText>(R.id.editTextPegarDados)
        val buttonPegarDados = findViewById<Button>(R.id.buttonPegarDados)
        val textViewDados = findViewById<TextView>(R.id.textViewDados)

        buttonPegarDados.setOnClickListener {
            textViewDados.text = editTextPegarDados.text.toString()
        }
    }
}