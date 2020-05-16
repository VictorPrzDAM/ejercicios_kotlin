package p01_introduction

/*
In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
If you need a variable that can be null, declare it nullable by adding ? at the end of its type.


   1 Declares a non-null String variable.
   2 When trying to assign null to non-nullable variable, a compilation error is produced.
   4 Declares a nullable String variable.
   4 Sets the null value to the nullable variable. This is OK.
   5 When inferring types, the compiler assumes non-null for variables that are initialized with a value.
   6 When trying to assign null to a variable with inferred type, a compilation error is produced.
   7 Declares a function with a non-null string parameter.
   8 Calls the function with a String (non-nullable) argument. This is OK.
   9 When calling the function with a String? (nullable) argument, a compilation error is produced.

 */
fun main() {

    var neverNull: String = "This can't be null"            // 1

//    neverNull = null                                      // 2 daria error en tiempo de compliación

    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5 el compilador asume simpre no nulo salvo que se le indique con ?

//    inferredNonNull = null                                  // 6

    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }

    strLength(neverNull)                                    // 8
//    strLength(nullable)                                     // 9 daria error en tiempo de compliación
}
