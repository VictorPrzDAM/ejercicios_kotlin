package p01_introduction

/*
1 If you want to use a parameterized constructor of the superclass when creating a subclass,
  provide the constructor arguments in the subclass declaration.
*/
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}
class SiberianTiger : Tiger("Siberia")                  // 1



fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}
