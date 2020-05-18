package p05_Collections

/*
Defines a collection of numbers.
Builds a list in which every collection element is repeated three times.
Important thing is that it's not a list of lists; it's a list of integers with nine elements.
 */
fun main() {
//    flatMap transforms each element of a collection into an iterable object and builds a single
//    list of the transformation results. The transformation is user-defined.
    val numbers = listOf(1, 2, 3)                        // 1

    // para cada elemento inserta en una nueva lista el elemnto antiguo it seguido de 10 20 30
    val tripled = numbers.flatMap { listOf( it,10, 20, 30) } // 2
//    val tripled = numbers.flatMap { listOf(it, it, it) } // 2

    println("Numbers: $numbers")
    println("Transformed: $tripled")
}