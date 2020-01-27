package com.risopatatekotlin.types

import types.StringDef

object EmployerAltRole {

    @StringDef(
        SCRUM_MASTER,
        AUTOMATION_HERO,
        HEAD)
    @Retention(AnnotationRetention.SOURCE)
    annotation class Type

    const val SCRUM_MASTER = "SCRUM MASTER"
    const val AUTOMATION_HERO = "AUTOMATION HERO"
    const val HEAD = "HEAD"
}