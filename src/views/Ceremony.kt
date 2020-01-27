package com.risopatatekotlin.views

import com.risopatatekotlin.models.Employer

open class Ceremony(boh: String?) {

    //possiamo modificare la visibilità del costruttore
    private constructor(i: Int): this(null)

    constructor(boh: String?, i: Int): this(boh)

    lateinit var employers: List<Employer>

    open var example = 1
    set(value) {
        field = value
    }
    get() {
        return field++
    }

    protected open fun exampleFun() {
    }
}