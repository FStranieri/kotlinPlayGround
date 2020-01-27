package com.risopatatekotlin.views

//a differenza dell'enum possiamo avere parametri di diversi tipi
sealed class ExampleSealed {
    data class Lillo1(val number: Int) : ExampleSealed()

    class Lillo2(val firstName: String, val lastName: String) : ExampleSealed()

    object Lillo3 : ExampleSealed() {
        const val SKILL = "SO FARE TUTTO"
    }
}

enum class Example(value: Int) {
    Lillo1(1),
    Lillo2(2),
    Lillo3(3)
}
