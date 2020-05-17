package p04_Funtional
/*
1 Declares a higher-order function that returns a function.
2 Declares a function matching the signature.
3 Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
 Invokes func. The square function is actually executed.
 */

// : (parametro_de_mi_funcion) -> retorno_de_mi_funcion
fun operation(): (Int,Int) -> Int {                                     // 1
    return ::square //recordar que ::nombre es la forma de referirse a una operación
}

fun square(x: Int,y: Int) = y * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2,5))                                                // 4
}