package de.ra

fun main() {
    // val keyword is like a const, value of a val variable can not be changed.
    val pi = 3.141592653589793238

    // var is a variable that can be changed anytime in the program.
    var count = 1

    // println is used for printing
    println("This program prints the pi value 3 times")

    // using $ symbol is a template
    println("$count: $pi")

    count = 2
    println("$count: $pi")

    count += 1
    println("$count: $pi")

    //Performing the below comment will throw error since pi (declared using val) can not be changed
    // pi = 456.46756
}