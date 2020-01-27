package com.risopatatekotlin

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.html.*
import kotlinx.html.*
import kotlinx.css.*
import com.fasterxml.jackson.databind.*
import com.risopatatekotlin.datasources.EmployerDataSource
import com.risopatatekotlin.datasources.FirstFloorDataSource
import com.risopatatekotlin.models.Employer
import com.risopatatekotlin.types.ChiliTeam
import com.risopatatekotlin.types.EmployerAltRole
import com.risopatatekotlin.types.EmployerRole
import com.risopatatekotlin.views.ExampleSealed
import io.ktor.jackson.*
import io.ktor.features.*
import io.ktor.client.*
import io.ktor.client.engine.apache.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    routing {
        val employers = FirstFloorDataSource().load()

        //GET ALL
        get("/chili/employers") {
            call.respond(employers)
        }

        //GET H8
        get("/chili/h8") {
            call.respond(employers.filter { it.team == ChiliTeam.HATEFUL_EIGHT })
        }

        //GET GOONIES
        get("/chili/goonies") {
            call.respond(employers.filter { it.team == ChiliTeam.GOONIES })
        }

        //GET A-TEAM
        get("/chili/a-team") {
            call.respond(employers.filter { employer -> employer.team == ChiliTeam.`A-TEAM` })
        }

        //GET MANAGER WHOSE LASTNAME STARTS WITH 'F' AND ENDS WITH 'I'
        get("/chili/freddi") {
            call.respond(employers.filter {
                it.role == EmployerRole.MANAGER
                        && it.lastName.startsWith("f", true)
                        && it.lastName.endsWith(ignoreCase = true, suffix = "i")
            })
        }

        //GET GOONIES WITHOUT SCRUM MASTER
        get("/chili/goonies/noscrum") {
            call.respond(employers.filter { employer ->
                employer.team == ChiliTeam.GOONIES
                        /*&& (employer.alterRoles == null
                        || employer.alterRoles?.contains(EmployerAltRole.SCRUM_MASTER) == false)*/
                        //RETURN VISK
                        //&& employer.alterRoles?.contains(EmployerAltRole.SCRUM_MASTER) == true
                //RETURNS ANGELONE
                        && employer.alterRoles?.contains(EmployerAltRole.SCRUM_MASTER) == false
            })
        }

        //GET SCRUMWATER
        get("/chili/scrumwater") {
            val tempList = mutableListOf<Employer>()

            employers.forEach { employer ->

                /*
                employer.alterRoles?.let {
                    altRoles.forEach {

                    }
                }
                 */


                /*
                employer.alterRoles?.run {
                    this.forEach {

                    }

                    //also non nasconde il 'this' passato da 'run'
                    this.also {

                    }
                }
                 */

                employer.alterRoles?.forEach { altRole ->
                    if (altRole == EmployerAltRole.SCRUM_MASTER) {
                        tempList.add(employer)
                    }

                    //WHEN
                    /*
                    when (altRole) {
                        EmployerAltRole.SCRUM_MASTER -> tempList.add(employer)
                    }
                     */
                }
            }

            with (tempList) {
                val bottiglietta = Employer(
                    lastName = "Cimone",
                    firstName = "Monte",
                    role = EmployerRole.LILLO,
                    alterRoles = null,
                    nickName = "Bottiglietta d'acqua del distributore",
                    team = null
                )

                val spa = "S.p.a."

                bottiglietta.franco("ARGENTA $spa - ${bottiglietta.lastName}")

                this.add(bottiglietta)
            }

            call.respond(tempList)
        }

        //TEST SEALED CLASS
        get("/chili/testSealed") {
            //è come una classa astratta quindi non possiamo istanziarla
            //val sampleSealed = ExampleSealed()

            val lillo2 = ExampleSealed.Lillo2("Lillo", "Avarello")
            val lillo1 = ExampleSealed.Lillo1(1)
            val lillo3 = ExampleSealed.Lillo3

            call.respond("${lillo2.firstName} ${lillo2.lastName} N${lillo1.number}: ${lillo3.SKILL}")
        }
    }
}

//extension function
fun Employer.franco(newValue: String) {
    this.team = newValue
}
