package p05_Collections

//getOrElse
//getOrElse provides safe access to elements of a collection. It takes an index and a function
// e default value in cases when the index is out of bound.

fun main() {

    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })    // 1
    println(list.getOrElse(10) { 42 })   // 2
}
//Target platform: JVMRunning on kotlin v. 1.3.72
//Prints the element at the index 1.
//Prints 42 because the index 10 is out of bounds.
//getOrElse can also be applied to Map to get the value for the g