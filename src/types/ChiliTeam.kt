package com.risopatatekotlin.types

import types.StringDef

object ChiliTeam {

    @StringDef(
        HATEFUL_EIGHT,
        GOONIES,
        `A-TEAM`,
        BIG_DATA,
        CONTENT_PRODUCTION,
        DEV_OPS
        )
    @Retention(AnnotationRetention.SOURCE)
    annotation class Type

    const val HATEFUL_EIGHT = "H7"
    const val GOONIES = "GUNNIES"
    const val `A-TEAM` = "HEY-TEAM"
    const val BIG_DATA = "BIIIIIIIIG DATA"
    const val CONTENT_PRODUCTION = "DA MARIANI"
    const val DEV_OPS = "OPS!"
}