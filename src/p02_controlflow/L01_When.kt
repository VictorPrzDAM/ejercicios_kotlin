package p02_controlflow

/**
    Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction.
    It can be used either as a statement or as an expression.
 */
/*
   1 This is a when statement.
   2 Checks whether obj equals to one.
   3 Checks whether obj equals to Hello.
   4 Performs type checking.
   5 Performs inverse type checking.
   6 Default statement (might be omitted).
 */
fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

class MyClass