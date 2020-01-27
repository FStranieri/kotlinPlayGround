package com.risopatatekotlin.models

import com.risopatatekotlin.types.ChiliTeam
import com.risopatatekotlin.types.EmployerAltRole
import com.risopatatekotlin.types.EmployerRole

data class Employer(val firstName: String,
                    val lastName: String,
                    var nickName: String?,
                    @EmployerRole.Type val role: String,
                    @EmployerAltRole.Type var alterRoles: List<String>?,
                    @ChiliTeam.Type var team: String?)