package p06_ScopeFunctions

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

/*
apply executes a block of code on an object and returns the object itself. Inside the block, the object is referenced
 by this. This function is handy for initializing objects.


1 Creates a Person() instance with default property values.
2 Applies the code block (next 3 lines) to the instance.
3 Inside apply, it's equivalent to jake.name = "Jake".
4 The return value is the instance itself,
    so you can chain other operations.

 */
fun main() {
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
}