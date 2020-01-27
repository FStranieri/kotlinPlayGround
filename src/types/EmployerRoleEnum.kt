package com.risopatatekotlin.types

enum class EmployerRoleEnum(private val role: String) {
    DEVELOPER("dev"),
    QA("qa"),
    CONTENT_PRODUCTION("cp"),
    PRODUCT_OWNER("po"),
    MANAGER("manager"),
    HEAD_OF_AGILE_DELIVERY("luca"),
    LILLO("lillo");

    override fun toString() = this.role
}