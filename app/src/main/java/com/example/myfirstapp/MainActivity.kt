package com.example.myfirstapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var weightEditText: EditText
    lateinit var calculateButton: Button
    lateinit var bmiResultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // wywołuje implementację onCreate() z klasy nadrzędnej

        enableEdgeToEdge() // włącza tryb Edge-to-Edge, czyli pozwala aplikacji rysować interfejs pod paskiem statusu u góry ekranu i paskiem nawigacji na dole.

        setContentView(R.layout.activity_main) // ustawia wygląd ekranu aplikacji

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets -> // dopasowuje odstępy w układzie do pasków systemowych Androida.
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Jak odwołać się do naszych elementów umieszczonych w layoucie?
        val heightEditText: EditText = findViewById(R.id.heightEditText)

        weightEditText = findViewById(R.id.weightEditText)
        calculateButton = findViewById(R.id.calculateButton)
        bmiResultTextView = findViewById(R.id.bmiResultTextView)

        // Jak pobrać wartość z layoutu?
        val layoutValue = weightEditText.text.toString()  // samo weightEditText zwróci obiekt, nie wartość, którą wpisał użytkownik

        // Jak ustawić, co przycisk ma robić?
        calculateButton.setOnClickListener {
            doSomething()
        }

        // Jak ustawić wartość w layoucie?
        bmiResultTextView.text = "wynik operacji"

    }

    fun doSomething() {
        // Drobny popup, który pojawi się na chwilę w naszej aplikacji - przydatny przy debuggowaniu! Warto obczaić też Logcat
        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show()
    }
}