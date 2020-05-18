package p05_Collections
/*
first, last
These functions return the first and the last element of the collection correspondingly.

You can also use them with a predicate; in this case, they return the first or the last element that matches the given predicate.
If a collection is empty or doesn't contain elements matching the predicate, the functions throw NoSuchElementException.
 */
fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    var first = numbers.first()                          // 2
    var last = numbers.last()                            // 3

    val firstEven = numbers.first { it % 2 == 0 }        // 4
    val lastOdd = numbers.last { it % 2 != 0 }           // 5

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

/*
1 Defines a collection of words.
2 Defines an empty collection.
3 Picks the first element from empty collection. It supposed to be null.
4 Picks the last element from empty collection. It supposed to be null as well.
5 Picks the first word starting with 'f'.
6 Picks the first word starting with 'z'.
7 Picks the last word ending with 'f'.
8 Picks the last word ending with 'z'.
 */
    val words = listOf("foo", "bar", "zaz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val  firstWord = empty.firstOrNull()                        // 3
    val  lastWord = empty.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8


    println("First $firstWord, last $lastWord")
    println("First starts with 'f' is $firstF, last starts with 'z' is $firstZ")
    println("First ends with 'f' is $lastF, last ends with 'z' is $lastZ")
}