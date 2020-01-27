package com.risopatatekotlin.types

import types.StringDef

object EmployerRole {

    @StringDef(
        DEVELOPER,
        QA,
        CONTENT_PRODUCTION,
        PRODUCT_OWNER,
        MANAGER,
        HEAD_OF_AGILE_DELIVERY,
        LILLO,
        DEV_OPS)
    @Retention(AnnotationRetention.SOURCE)
    annotation class Type

    const val DEVELOPER = "DEVELOPER"
    const val QA = "QA"
    const val CONTENT_PRODUCTION = "CONTENT PRODUCTION"
    const val PRODUCT_OWNER = "PO"
    const val MANAGER = "MANAGER"
    const val HEAD_OF_AGILE_DELIVERY = "HEAD OF AGILE DELIVERY"
    const val LILLO = "LILLO"
    const val DEV_OPS = "OPS"
}