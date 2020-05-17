package p02_controlflow

//here is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:

fun main() {
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
}