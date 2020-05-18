package p05_Collections

//min and max functions return the smallest and the largest element of a collection. If the collection is empty, they return null.

fun main() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()

    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}") // 1
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")        // 2
}
//For non-empty collection functions return the smallest and the largest element.
//For empty collections both functions return null.
