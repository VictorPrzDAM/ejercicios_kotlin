package p05_Collections

fun main() {
/*
    Defines a collection of numbers.
    Counts the total number of elements.
    Counts the number of even elements.
 */
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("Total number of elements: $totalCount")
    println("Number of even elements: $evenCount")
}