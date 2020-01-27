package com.risopatatekotlin.datasources

import com.risopatatekotlin.models.Employer

interface EmployerRepository {
    fun getEmployers(floor: Int): List<Employer>

    fun insertEmployers(employers: List<Employer>, floor: Int)

    fun insertEmploy(employ: Employer, floor: Int)

    fun replaceEmployers(employers: List<Employer>, floor: Int)
}