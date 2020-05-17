package p03_SpecialClases

import java.util.Random

/*
Object means "single" , you can think of the Singleton pattern: it ensures you that only one
instance of that class is created even if 2 threads try to create it.

   1 Defines a blueprint.
   2 Defines a method.
   3 Creates instances.
   4 Calls the method on instances.
*/
class LuckDispatcher {                    //1
    fun getNumber() {                     //2
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()

    d1.getNumber()                        //4
    d2.getNumber()
    //
}