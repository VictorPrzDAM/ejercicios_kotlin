package p8_ProductivityBooseters

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}

data class User(val username: String, val email: String)    // 1

fun getUser() = User("Mary", "mary@somewhere.com")
fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)                              // 1

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {                                      // 2
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))    // 3

    ///////////////////////////////////////////////////////////////////////////////

    /*
        Defines a data class.
        Destructures an instance. Declared values are mapped to the instance fields.
        Data class automatically defines the component1() and component2() methods that will be called during destructuring.
        Use underscore if you don't need one of the values, avoiding the compiler hint indicating an unused variable.
 */


    val user = getUser()
    val (username, email) = user                            // 2
    println(username == user.component1())                  // 3

    val (_, emailAddress) = getUser()                       // 4
}