package p06_ScopeFunctions
/*
1 Calls the given block on the result on the string "test".
2 Calls the function on "test" by the it reference.
3 let returns the value of this expression.


------------------------------------------------
4 Uses safe call, so let and its code block will be executed only on non-null values.
 */
fun customPrint(s: String) {
    print(s.toUpperCase())
}

fun main() {
    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        //null save
        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
                                 // 4
//            print("\t")
//            customPrint( str!! )
//            println()

    }
    printNonNull(null)
    printNonNull("my string")
}