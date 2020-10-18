package de.ra.datatype

fun main() {
    val flag1 = true
    val flag2 = "true".toBoolean()
    val funCoding: Boolean = true

    println("flag1 type is ${flag1::class.qualifiedName}")
    println("flag2 type is ${flag2::class.qualifiedName}")
    println("funCoding type is ${funCoding::class.qualifiedName}")
}