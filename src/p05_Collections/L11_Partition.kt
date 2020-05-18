package p05_Collections

// partition function splits the original collection into pair of lists using a given predicate:
// Elements for which the predicate is true. Elements for which the predicate is false.
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)                // 1

    val evenOdd = numbers.partition { it % 2 == 0 }           // 2
    val (positives, negatives) = numbers.partition { it > 0 } // 3

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")
}
/*
Defines a collection of numbers.
Splits numbers into a Pair of lists with even and odd numbers.
Splits numbers into two lists with positive and negative numbers. Pair destructuring is applied here to get the Pair members.
 */