package de.ra.datatype

fun main() {
    /**
     * One way creating array
     */
    val cities = arrayOf("Bangalore", "Mumbai", "Delhi")
    println("cities value = " + cities.contentToString())   // contentToString converts the content of an array into a string

    /**
     * Arrays with all the elements sets to null can be created, and later a value can be assigned using the indexing operator [] or set method
     */
    val initialNullArray = arrayOfNulls<Int>(2)
    println("initialNullArray value Before assignment = " + initialNullArray.contentToString())
    initialNullArray[0] = 10
    initialNullArray.set(1, 20)
    println("initialNullArray value After assignment = " + initialNullArray.contentToString())

    /**
     * Array constructor can be used to create an Array. It takes size and a function as argument. Function returns the initial value for all the
     * elements in array
     */
    val dummyArray = Array<Int>(4) { i -> i + 1 }
    println("dummyArray value = " + dummyArray.contentToString())

    /**
     * Finally, there are primitive type array
     */

    val intArrayVar1 = intArrayOf(1, 2, 3, 4, 5)
    val intArrayVar2 = IntArray(5) { i -> i + 1 }
    val intArrayVar3 = IntArray(5)  // all elements are initialized to 0
    val intArrayVar4 = IntArray(5) {100} // all elements are initialized to 100

    println(intArrayVar1.contentToString())
    println(intArrayVar2.contentToString())
    println(intArrayVar3.contentToString())
    println(intArrayVar4.contentToString())

    val shortArrayVar1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArrayVar2 = ShortArray(5) { i -> (i + 1).toShort() }
    val shortArrayVar3 = ShortArray(5)  // all elements are initialized to 0
    val shortArrayVar4 = ShortArray(5) {100} // all elements are initialized to 100

    /**
     * Likewise we have,
     * 1. IntArray
     * 2. LongArray
     * 3. DoubleArray
     * 4. FloatArray
     * 5. CharArray
     * 6. ShortArray
     * 7. BooleanArray
     * 8. ByteArray
     *
     * We also have arrays for Unsigned number data type
     * 9. UByteArray
     * 10. UIntArray
     * 11. ULongArray
     * 12. UShortArray
     */
}