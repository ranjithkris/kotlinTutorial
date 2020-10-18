package de.ra.datatype

fun main() {
    val year = 2020.toString()
    println("${year::class.qualifiedName}")

    /**
     * Empty string can be created using String constructor
     */
    val emptyString = String()
    println("Empty String = $emptyString")

    /**
     * One way of declaring String is using double quotes and can contain escape characters like \n
     */
    val cities = "Bangalore\nMumbai\nDelhi\nPune"
    println("${cities::class.qualifiedName}")

    /**
     * Another way is using three times double quotes and can not contain escape characters like \n, but can contain multiline strings
     */
    val multiLineString = """Hi!!!
        Welcome to Kotlin!!
    """
    println("${multiLineString::class.qualifiedName}")
    println(multiLineString)

    // Printing multiLineString, it contains all the spaces till Welcome, therefore to trim those spaces, indent your statements and use
    // trimIndent. (Note: there are different ways to trim the spaces.)

    val trimmedMultiLineString: String = """
        Hi there!!!!
        Welcome to Kotlin!!
    """.trimIndent()
    println(trimmedMultiLineString)
}