package p01_introduction

/**
1 Defines a generic class MutableStack<E> where E is called the generic type parameter.
2 At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
3 Inside the generic class, E can be used as a parameter like any other type.
4 You can also use E as a return type.
5 Note that the implementation makes heavy use of Kotlin's shorthand syntax
  for functions that can be defined in a single expression.

 */
class MutableStack<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

//    override fun toString() = "MutableStack(${elements.joinToString()})"
    override fun toString() : String{

//    val toString = super.toString()
    return "MutableStack(${elements.joinToString()})"}

}

fun main() {
    var a : MutableStack <String> = MutableStack( "hola ","cómo ")
    var b  = MutableStack  ( "hola")
    println(a)
}