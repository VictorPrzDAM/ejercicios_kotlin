package p02_controlflow

/*
   1 Defines an iterator in a class. It must be named iterator and have the operator modifier.
   2 Returns the iterator that meets the following method requirements:
         next(): Animal
         hasNext(): Boolean
   3 Loops through animals in the zoo with the user-defined iterator.
 */
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}