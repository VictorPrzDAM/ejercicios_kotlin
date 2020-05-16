package p01_introduction

/*
Member functions and extensions with a single parameter can be turned into infix functions.


1  Defines an infix extension function on Int.
2  Calls the infix function.
3  Creates a Pair by calling the infix function to from the standard library.
4  Here's your own implementation of to creatively called onto.
5  Infix notation also works on members functions (methods).
6  The containing class becomes the first parameter.
 Note that the example uses local functions (functions nested within another function).
  */


fun main() {

    /**
     * infix fun -- indica que el tipo de función será inferida.
     *
     * Int. indica el tipo de parámetro sobre el que se realizará la llamada, en este caso un entero,
     * cuyo valor para el ejemplo es 2  e.g  2 times "Bye "
     * times es la palabra con la que se llamará a la función
     * (str: String)
     *
     * = str.repeat(this)
     */

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println( 2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5




    infix fun Int.shl(x: Int): Int {
        return 0
    }

// calling the function using the infix notation
    1 shl 2

// is the same as
    1.shl(2)


}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }  // 6
}

