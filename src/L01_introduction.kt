//fun main(args: Array<String>) { // en versiones anteriores al 1.3
fun main() {
    //El primer HolaMundo en Kotlin
    println("Hello, Word!")
    //Ejemplo de función
    print(imprimeMensaje("hola soy el método \"imprimeMensaje\" "))
    // Función con parámetro opcional
    // print(imprimirMensajeConPrefijo("hola soy el método \"imprimirMensajeConPrefijo\"", "¿"))
    print(imprimirMensajeConPrefijo("hola soy el método \"imprimirMensajeConPrefijo\""))
    //Función que retorna un valor
    println("La suma es : "+suma(1,2))
}
//Ejemplo de una función:
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
fun imprimirMensajeConPrefijo(mensaje: String, prefix: String = "info"):Unit {
    println("[$prefix] $mensaje")
}

/**
 * : Int --> indica el retorno de un entero.
 */
fun suma(x: Int, y: Int): Int {
    return x + y
}