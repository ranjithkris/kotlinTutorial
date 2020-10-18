package de.ra.datatype

/**
 * Look at the resource for more details on all the methods in String
 * Resource:
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/
 */
fun main() {
    val message = "       Hey there!!! Welcome to Kotlin!!        "

    println("Origin String = \"$message\"")
    println("Length = " + message.length)   // Length of the String (i.e. number of characters in a string)

    /**
     * Retrieve single character
     */
    println("25th character using get method = ${message.get(24)}")     // Returns the 25th character i.e. 24th index
    println("25th character using indexing operator = ${message[24]}")  // Returns the 25th character i.e. 24th index

    /**
     * Comparision
     */

    // If both are equal then it returns 0, If the passed string is greater then it returns -ve, otherwise it returns a +ve number.
    println("message.compareTo(\"hello\") = ${message.compareTo("hello")}")

    // if both strings are equal then it returns true otherwise false. It is equivalent to message == "hello"
    println("message.equals(\"hello\") = ${message.equals("hello")}")


    /**
     * Trim
     */

    println("trim() = \"${message.trim()}\"")                           // Removes leading and trailing spaces
    println("trim('!',' ') = \"${message.trim('!', ' ')}\"")      // Removes '!' and ' ' characters from the leading and trailing of the string
    println("trimStart() = \"${message.trimStart()}\"")                 // Removes spaces from leading of the string
    println("trimStart(' ') = \"${message.trimStart(' ')}\"")     // Removes ' ' (space) character from the leading of the string
    println("trimEnd() = \"${message.trimEnd()}\"")                     // Removes spaces from trailing of the string
    println("trimEnd(' ') = \"${message.trimEnd(' ')}\"")         // Removes ' ' (space) character from the trailing of the string

    /**
     * Concatenation
     */
    println(message.plus("Welcome"))    // Concat two strings

    /**
     * Sub-sequence
     */
    println(message.subSequence(7, 18))  // 7 is start index and 18 is the end index and returns CharSequence
    println(message.substring(7, 18))    // Same as subSequence but return String not CharSequence
    println(message.substring(7))
    println(message.substring(IntRange(7,18)))
    println(message.substringAfter("!!!"))
}