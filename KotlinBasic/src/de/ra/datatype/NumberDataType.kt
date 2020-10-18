package de.ra.datatype

fun main() {
    // Integer

    /**
     * Byte:
     * 8 bits
     * -128 to 127
     */
    val byteVar1: Byte = 100
    val byteVar2 = (-100).toByte()
    println("byteVar1 type is ${byteVar1::class.qualifiedName}")  // ${byteVar1::class.qualifiedName} gives the type of byteVar1 variable
    println("byteVar2 type is ${byteVar2::class.qualifiedName}")

    /**
     * Short:
     * 16 bits
     * -32768 to 32767
     */
    val shortVar1: Short = 20624
    val shortVar2 = 10254.toShort()
    println("shortVar1 type is ${shortVar1::class.qualifiedName}")
    println("shortVar2 type is ${shortVar2::class.qualifiedName}")

    /**
     * Int:
     * 32 bits
     * -2147483648 to 2147483647
     */
    val intVar1: Int = 26541524
    val intVar2 = 26541524
    println("intVar1 type is ${intVar1::class.qualifiedName}")
    println("intVar2 type is ${intVar2::class.qualifiedName}")

    /**
     * Long:
     * 64 bits
     * -9223372036854775808 to 9223372036854775807
     */
    val longVar1: Long = 8642554857659586
    val longVar2 = 8642554857659586   // Since the number is large, the type if Long
    val longVar3 = 26541524.toLong()
    println("longVar1 type is ${longVar1::class.qualifiedName}")
    println("longVar2 type is ${longVar2::class.qualifiedName}")
    println("longVar3 type is ${longVar3::class.qualifiedName}")

    //Floating-Point

    /**
     * Float:
     * 32 bits
     * 6 to 7 precision
     */
    val floatVar1 = 3.5F
    val floatVar2: Float = 3.5.toFloat()
    println("floatVar1 type is ${floatVar1::class.qualifiedName}")
    println("floatVar2 type is ${floatVar2::class.qualifiedName}")

    /**
     * Double:
     * 16 to 17 precision
     */
    val doubleVar1 = 325.3264154
    val doubleVar2: Double = 3.toDouble()
    println("doubleVar1 type is ${doubleVar1::class.qualifiedName}")
    println("doubleVar2 type is ${doubleVar2::class.qualifiedName}")
}