package p01_introduction


//Para compara la clase genérica con la función genérica.
class miClaseMutable<T>(vararg items: T) {              // 1
    //...
}
//Función genérica de tipo E
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements) // MutableStack es un clase que ya hemos creado antes

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    //¿y que significa el asterisco antes de los elementos MutableStack(*elements)?
    //Sirve para pasar un conjunto a un parámetro varargs.
    //You can pass an array into it like so...
    val numbers = intArrayOf(2, 3, 4)
    val sum = sumOfNumbers(*numbers)
    println(sum) // Prints '9'
}

fun sumOfNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}
