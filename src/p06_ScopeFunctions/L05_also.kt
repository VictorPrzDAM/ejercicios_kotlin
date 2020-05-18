package p06_ScopeFunctions


fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    val jake = Person("Jake", 30, "Android developer")   // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
    val a = jake
}
/*
Creates a Person() object with the given property values.
Applies the given code block to the object. The return value is the object itself.
Calls the logging function passing the object as an argument.
*/