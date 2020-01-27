package com.risopatatekotlin.views

class Refinement: Ceremony(null) {

    override var example: Int
        get() = super.example + 2
        set(value) {

        }

    override fun exampleFun() {
    }
}