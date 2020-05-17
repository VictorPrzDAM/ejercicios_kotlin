package p03_SpecialClases


/*
       1 Defines a simple enum class with three enum instances. The number of instances is always
            finite and they are all distinct.
       2 Accesses an enum instance via the class name.
       3 With enums, the compiler can infer if a when-expression is exhaustive so
            that you don't need the else-case.
 */
enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

enum class Color(val rgb: Int) {                      // 1b
    RED(0xFF0000),                                // 2b
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);  // 3b

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED ->  "It's finished"
    }
    println(message)

    //
    /*
    1b   Defines an enum class with a property and a method.
    2b    Each instance   must pass an argument   for the constructor parameter.
    3b    Enum class members are separated from the instance definitions by a semicolon.
    4b    The default toString returns the name of the instance, here "RED".
    5b    Calls a method on an enum instance.
    6b    Calls a method via enum class name.
    */
    val red = Color.RED
    println(red)                                      // 4b
    println(red.rgb)
    println(Color.GREEN.ordinal)
    println(red.containsRed())                        // 5b
    println(Color.BLUE.containsRed())                 // 6b
}
