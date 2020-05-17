package p05_Collections

fun main() {
    /*
    1 Defines a collection of numbers.
    2 Checks if there are negative elements.
    3 Checks if there are elements greater than 6.
    */

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println("Numbers: $numbers")

    println("Is there any number less than 0: $anyNegative")

    println("Is there any number greater than 6: $anyGT6")


    /*
    Function all returns true if all elements in collection match the given predicate.

    Target platform: JVMRunning on kotlin v. 1.3.72
    Defines a collection of numbers.
    Checks whether all elements are even.
    Checks whether all elements are less than 6.
    */

    var allEven = numbers.all { it % 2 == 0 }            // 2

    var allLess6 = numbers.all { it < 6 }                // 3

    println("Numbers: $numbers")

    println("All numbers are even: $allEven")

    println("All numbers are less than 6: $allLess6")

/*
    Function none
            Function none returns true if there are no elements that match the given predicate in the collection.
 */

    allEven = numbers.none { it % 2 == 1 }           // 2
    allLess6 = numbers.none { it > 6 }               // 3

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("No element greater than 6: $allLess6")


}