package p01_introduction

// Variables:

fun main() {

    /*
   1 Declares a mutable variable and initializing it.
   2 Declares an immutable variable and initializing it.
   3 Declares an immutable variable and initializing it without specifying the type. The compiler infers the type Int.
     */
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3

/*
    1 Declares a variable without initialization.
    2 An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.
 */

    var e: Int  // 1
//    println(e)  // 2 daria error.
}