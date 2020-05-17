package p05_Collections

/*
map
    map extension function enables you to apply a transformation to all elements in a collection.
    It takes a transformer function as a lambda-parameter.
 */
/*
Defines a collection of numbers.
Doubles numbers.
Uses the shorter it notation to triple the numbers.
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}