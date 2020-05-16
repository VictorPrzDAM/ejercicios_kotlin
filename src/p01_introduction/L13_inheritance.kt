package p01_introduction
/*
1 Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
2 Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
3 A class inherits a superclass when you specify the : SuperclassName() after its name. The empty parentheses ()
    indicate an invocation of the superclass default constructor.
4 Overriding methods or attributes requires the override modifier.
 */

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
    override fun toString(): String {
        return "I´m a dog "
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
    override fun toString(): String {
        return """and I am a YorkShire ${super.toString()} """
    }
}

fun main() {
    println("""
        ---Ejemplo de clases---
    """.trimIndent())
    val dog: Dog = Yorkshire()
    println(dog)
    dog.sayHello()
}