package com.example.myfirstapp

class KotlinIntroduction {

    // 1. ZMIENNE
    val name: String = "Anna"   // wartość niezmienna
    var age: Int = 20           // wartość zmienna

    // 2. TYPY DANYCH
    val weight: Int = 65
    val price: Float = 170.0F
    val height: Double = 170.0
    val userName: String = "Anna"
    val isReady: Boolean = true
    val letter: Char = 'A'

    // 3. OPERATORY
    //    a == b    // równe
    //    a != b    // różne
    //    a > b     // większe
    //    a < b     // mniejsze
    //    a >= b    // większe lub równe
    //    a <= b    // mniejsze lub równe

    val sum = 5 + 3
    val difference = 5 - 3
    val product = 5 * 3
    val division = 10.0 / 2.0

    val isAdult = age >= 18
    val isEqual = age == 20

    // 4. FUNKCJE
    fun doSomething(parameterOne: String, parameterTwo: Double): Double {
        return 120.0
    }

    // 5. IF / ELSE
    fun checkAge(age: Int): String {
        return if (age >= 18) {
            "Osoba pełnoletnia"
        } else {
            "Osoba niepełnoletnia"
        }
    }

    // 6. SWITCH W KOTLINIE - WHEN
    fun decideGrade() {
        val grade = 4

        when (grade) {
            1 -> println("Niedostateczny")
            2 -> println("Dopuszczający")
            3 -> println("Dostateczny")
            4 -> println("Dobry")
            5 -> println("Bardzo dobry")
            else -> println("Nieznana ocena")
        }
    }

    // 7. KONWERSJA TEKSTU NA LICZBĘ
    fun convertForCalculation(text: String): Double? {
        return text.replace(',', '.').toDoubleOrNull()
    }

    // 8. NULL SAFETY
    fun getValueOrZero(value: Double?): Double {
        return value ?: 0.0
    }
}