package de.ra.datatype

fun main() {
    val unsignedVar = 1u

    println(unsignedVar)

    val signedVar: Int = -120
    println("SignedVar = $signedVar")

    // Int is 32 bits, therefore -120 becomes 4294967176 in  unsigned Int
    // 11111111111111111111111110001000
    val unsignedVar1: UInt = signedVar.toUInt()

    println("Converted unsignedVar1 = $unsignedVar1")
}