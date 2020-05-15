//fun main(args: Array<String>) { // en versiones anteriores al 1.3
fun main() {
    //El primer HolaMundo en Kotlin
    print("Hello, Word!")
    //Ejemplo de función
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
fun imprimirMensajeConPrefijo(mensaje : String , prefix: String = "info"){

}