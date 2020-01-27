package com.risopatatekotlin.datasources

import com.risopatatekotlin.models.Employer
import com.risopatatekotlin.types.ChiliTeam
import com.risopatatekotlin.types.EmployerAltRole
import com.risopatatekotlin.types.EmployerRole

class FirstFloorDataSource: EmployerDataSource() {

    init {
        save()
    }

    fun load(): List<Employer> {
        return super.getEmployers(FIRST_FLOOR)
    }

    //INLINE
    //fun load() = super.load(FIRST_FLOOR)

    fun save() {
        insertH8()
        insertGoonies()
        `insertA-Team`()
        insertBigData()
        insertContentProduction()
        insertDevOps()
        insertManagers()

        //ADD PO
        insertEmploy(
            Employer(
            "Christian",
            "Alfarano",
                null,
                EmployerRole.PRODUCT_OWNER,
                null,
                null
        ), FIRST_FLOOR)

        //ADD HEAD OF AGILE DELIVERY
        insertEmploy(
            Employer(
            "Luca",
            "Giovenzana",
                null,
                EmployerRole.HEAD_OF_AGILE_DELIVERY,
                null,
                null
        ), FIRST_FLOOR)

        //ADD LILLO
        insertEmploy(
            Employer(
            "Lillo",
            "Avarello",
                null,
                EmployerRole.LILLO,
                null,
                null
        ), FIRST_FLOOR)
    }

    //ADD H8
    private fun insertH8() {
        insertEmployers(listOf(
            Employer(
                "Francesco",
                "Stranieri",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Gianpaolo",
                "Caprara",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Marco",
                "Loche",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Carlo",
                "Cardani",
                null,
                EmployerRole.DEVELOPER,
                listOf(EmployerAltRole.SCRUM_MASTER),
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Max",
                "Valieri",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Roberta",
                "Massimino",
                null,
                EmployerRole.QA,
                null,
                ChiliTeam.HATEFUL_EIGHT
            ),
            Employer(
                "Emanuele",
                "Bonanno",
                "ROCCO",
                EmployerRole.QA,
                null,
                ChiliTeam.HATEFUL_EIGHT
            )
        ), FIRST_FLOOR)
    }

    //ADD GOONIES
    private fun insertGoonies() {
        insertEmployers(listOf(
            Employer(
                "Gabriele",
                "Gozzoli",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.GOONIES
            ),
            Employer(
                "Marco",
                "Visconti",
                null,
                EmployerRole.DEVELOPER,
                listOf(EmployerAltRole.SCRUM_MASTER),
                ChiliTeam.GOONIES
            ),
            Employer(
                "Luigi",
                "Catuogno",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.GOONIES
            ),
            Employer(
                "Nicola",
                "Mincuzzi",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.GOONIES
            ),
            Employer(
                "Andrea",
                "Bozza",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.GOONIES
            ),
            Employer(
                "Matteo",
                "Calabrese",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.GOONIES
            ),
            Employer(
                "Angelo Andrea Gabriele",
                "Caovilla",
                "ANGELONE",
                EmployerRole.QA,
                listOf(EmployerAltRole.AUTOMATION_HERO),
                ChiliTeam.GOONIES
            )
        ), FIRST_FLOOR)
    }

    //ADD A-TEAM
    private fun `insertA-Team`() {
        insertEmployers(listOf(
            Employer(
                "Matteo",
                "Villa",
                "MAESTRO",
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Marco",
                "Allotta",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Marco",
                "Cattaneo",
                "CATTY",
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Andrea",
                "D'Agostino",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Antony",
                "Fortunato",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Giuseppe",
                "Zarcone",
                "GESU'",
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.`A-TEAM`
            ),
            Employer(
                "Fabrizio",
                "Premoli",
                null,
                EmployerRole.QA,
                listOf(EmployerAltRole.SCRUM_MASTER),
                ChiliTeam.`A-TEAM`
            )
        ), FIRST_FLOOR)
    }

    private fun insertBigData() {
        insertEmployers(listOf(
            Employer(
                "Simone",
                "Livraghi",
                null,
                EmployerRole.DEVELOPER,
                listOf(EmployerAltRole.HEAD),
                ChiliTeam.BIG_DATA
            ),
            Employer(
                "Antonio",
                "Puce",
                "PUCCIO",
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.BIG_DATA
            ),
            Employer(
                "Alberto",
                "Fedrici",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.BIG_DATA
            ),
            Employer(
                "Stefano",
                "Castoldi",
                "STEFANONE",
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.BIG_DATA
            ),
            Employer(
                "Vincenzo",
                "Ricchiuti",
                null,
                EmployerRole.DEVELOPER,
                null,
                ChiliTeam.BIG_DATA
            )
        ), FIRST_FLOOR)
    }

    private fun insertContentProduction() {
        insertEmployers(listOf(
            Employer(
                "Andrea",
                "Mariani",
                null,
                EmployerRole.CONTENT_PRODUCTION,
                listOf(EmployerAltRole.HEAD),
                ChiliTeam.CONTENT_PRODUCTION
            ),
            Employer(
                "Simone",
                "Casale",
                null,
                EmployerRole.CONTENT_PRODUCTION,
                null,
                ChiliTeam.CONTENT_PRODUCTION
            ),
            Employer(
                "Alessandro",
                "Frasca",
                null,
                EmployerRole.CONTENT_PRODUCTION,
                null,
                ChiliTeam.CONTENT_PRODUCTION
            ),
            Employer(
                "Vincenzo",
                "Trombetta",
                null,
                EmployerRole.CONTENT_PRODUCTION,
                null,
                ChiliTeam.CONTENT_PRODUCTION
            )
        ), FIRST_FLOOR)
    }

    private fun insertDevOps() {
        insertEmployers(listOf(
            Employer(
                "Cosimo",
                "Meli",
                null,
                EmployerRole.DEV_OPS,
                null,
                ChiliTeam.DEV_OPS
            ),
            Employer(
                "Luca",
                "Tiozzo",
                null,
                EmployerRole.DEV_OPS,
                null,
                ChiliTeam.DEV_OPS
            )
        ), FIRST_FLOOR)
    }

    private fun insertManagers() {
        insertEmployers(listOf(
            Employer(
                "Stefano",
                "Flamia",
                null,
                EmployerRole.MANAGER,
                null,
                null
            ),
            Employer(
                "Matteo",
                "Freddi",
                null,
                EmployerRole.MANAGER,
                null,
                null
            )
        ), FIRST_FLOOR)
    }
}