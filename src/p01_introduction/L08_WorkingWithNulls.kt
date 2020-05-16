package p01_introduction

/*
Sometimes Kotlin programs need to work with null values, such as when interacting with external Java code or
representing a truly absent state. Kotlin provides null tracking to elegantly deal with such situations.
*/
/**
   1 A function that takes in a nullable string and returns its description.
   2 If the given string is not null and not empty, return information about its length.
   3 Otherwise, tell the caller that the string is empty or null.
 */
fun main() {
   var retonoNulo = describeString(null)
    println("retorno nulo $retonoNulo")
    var retorno = describeString("No soy null")
    println("retorno de mensaje$retorno")
}

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}