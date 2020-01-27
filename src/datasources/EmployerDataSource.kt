package com.risopatatekotlin.datasources

import com.risopatatekotlin.models.Employer

open class EmployerDataSource: EmployerRepository {

    private val chiliMap: MutableMap<Int, MutableList<Employer>> =
        mutableMapOf<Int, MutableList<Employer>>().apply {
        this[FIRST_FLOOR] = mutableListOf()
        this[SECOND_FLOOR] = mutableListOf()
        this[THIRD_FLOOR] = mutableListOf()
        this[FOURTH_FLOOR] = mutableListOf()
    }

    override fun getEmployers(floor: Int): List<Employer> {
        return this.chiliMap[floor] ?: listOf()
    }

    override fun insertEmployers(employers: List<Employer>, floor: Int) {
        if (this.chiliMap.containsKey(floor)) {
            this.chiliMap[floor]?.addAll(employers)
        }
    }

    override fun insertEmploy(employ: Employer, floor: Int) {
        if (this.chiliMap.containsKey(floor)) {
            this.chiliMap[floor]?.add(employ)
        }
    }

    override fun replaceEmployers(employers: List<Employer>, floor: Int) {
        if (this.chiliMap.containsKey(floor)) {
            this.chiliMap[floor] = employers.toMutableList()
        }
    }

    companion object {
        const val FIRST_FLOOR = 0
        const val SECOND_FLOOR = 1
        const val THIRD_FLOOR = 2
        const val FOURTH_FLOOR = 3
    }
}