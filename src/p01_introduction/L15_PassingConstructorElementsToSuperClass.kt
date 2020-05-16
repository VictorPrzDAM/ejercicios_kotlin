package p01_introduction

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}
/*
1 name in the Asiatic declaration is neither a var nor val: it's a constructor argument,
    whose value is passed to the name property of the superclass Lion.
2 Creates an Asiatic instance with the name Rufo. The call invokes the Lion constructor with arguments Rufo and India.

 */
class Asiatic(name: String , val zone: Int) : Lion(name = name, origin = "India") // 1

fun main() {
    val lion: Lion = Asiatic(name = "Rufo",zone =1234) //2
    val asiatic =  Asiatic("Rufo",1234) //2
    lion.sayHello()
    println( """"${asiatic.zone}""")
}