package p04_Funtional

/**
 * A higher-order function is a function that takes another function as parameter and/or returns a function.
 */
/*
1 Declares a higher-order function. It takes two integer parameters, x and y. Additionally,
    it takes another function operation as a parameter. The operation parameters and return type are also defined
    in the declaration.
2 The higher order function returns the result of operation invocation with the supplied arguments.
3 Declares a function that matches the operationsignature.
4 Invokes the higher-order function passing in two integer values and the function argument ::sum. :: is the notation
    that references a function by name in Kotlin.
5 Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?
 */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}