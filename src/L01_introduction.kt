//Funciones:
/**
 * fun  ---> función.
 * imprimeMensaje  --->  nombre de la función .
 * mensaje ---> nombre del parámetro.
 * :String tipo de parámetro.pu
 * :Unit ---> tipo de retorno en este caso es vacio.
 */
fun imprimeMensaje(mensaje: String): Unit {
    println("Mensaje desde Método imprime mensaje")
}

/**
String = "info" --> permite un parámetro opcional
 */
fun imprimirMensajeConPrefijo(mensaje: String, prefix: String = "info"): Unit {
    println("[$prefix] $mensaje")
}

/**
 * : Int --> indica el retorno de un entero.
 */
fun suma(x: Int, y: Int): Int {
    return x + y
}

/**
 * = x * y  --> inferir el retorno así nos ahorramos el cuerpo del método.
 */
fun multiplicar(x: Int, y: Int) = x * y
// Infix Functions
/**
 * Infix notation permite llamar a una fucnción omitiendo los parentesis () y el punto.
 * Son necesarios 3 requisitos:
 *  1- La funcion debe ser miembro de una clase o extensión
 *  2- Debe tener un único parámetro.
 *  3- El parámetro no debe tener un número variable de argumentos y ni valor por defecto
 *
 */
infix fun Int.veces(str: String) = str.repeat(this)

//
infix fun Int.xxxVeces(str: String): String {
    return str.repeat(this)
}

//fun main(args: Array<String>) { // en versiones anteriores al 1.3
fun main() {

    //El primer HolaMundo en Kotlin
    println("Hello, Word!")
    //
    println("--- Functions ---")
    //Ejemplo de función
    print(imprimeMensaje("hola soy el método \"imprimeMensaje\" "))
    // Función con parámetro opcional
    // print(imprimirMensajeConPrefijo("hola soy el método \"imprimirMensajeConPrefijo\"", "¿"))
    print(imprimirMensajeConPrefijo("hola soy el método \"imprimirMensajeConPrefijo\""))
    // Permite cambiar el orden de los parametro usando parametros nombrados
    print(
        imprimirMensajeConPrefijo(
            prefix = "?",
            mensaje = "hola soy el método llamado con parámetros nombrados \"imprimirMensajeConPrefijo\""
        )
    )
    //Función que retorna un valor
    println("La suma es : " + suma(1, 2))
    //Función con retorno inferido
    println("La multiplicación es es : " + multiplicar(3, 2))
    //
    //Infix Functions
    println("--- Infix Functions ---")
    //
    println(2 veces "Hola")
    //
    println(2 to "Hola")
    //Infix Functions
    val pair = "Ferrari" to "Katrina"
    println(pair)
    //
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)
    //
    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    //
    println(2 * "Bye ")// 2
printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

val str = "Always forgive your enemies; nothing annoys them so much."
println(str[0..14])                                          // 4


    val lion: Lion = Asiatic("Rufo")                              // 2
    lion.sayHello()



    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}
fun printAll(vararg messages: String) {                            // 1
    for (m in messages) println(m)
}

operator fun String.get(range: IntRange) = substring(range)  // 3


operator fun Int.times(str: String) = str.repeat(this)       // 1

fun  <E> mutableStackOf(vararg elements: E) =    MutableStack(*elements)
class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}


class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion( name, "India") // 1

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

