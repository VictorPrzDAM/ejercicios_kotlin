package p01_introduction

/*
A simple function that takes a parameter of type String and returns Unit (i.e., no return value).
A function that takes a second optional parameter with default value Info. The return type is omitted, meaning that it's actually Unit.
A function that returns an integer.
A single-expression function that returns an integer (inferred).
Calls the first function with the argument Hello.
Calls the function with two parameters, passing values for both of them.
Calls the same function omitting the second one. The default value Info is used.
Calls the same function using named arguments and changing the order of the arguments.
Prints the result of a function call.

 */
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // 4

fun main() {
    printMessage("Hello")                                                // 5
    printMessageWithPrefix("Hello", "Log")                // 6
    printMessageWithPrefix("Hello")                             // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
    println(sum(1, 2))                                            // 9
}