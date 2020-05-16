package p01_introduction

// Usuario class with a Primary constructor that accepts three parameters
class User(_id: Int, _name: String, _age: Int) {
    // Properties of Usuario class
    val id: Int = _id         // Immutable (Read only)
    var name: String = _name  // Mutable
    var age: Int = _age       // Mutable

    override fun toString(): String {
        return "Usuario(id=$id, name='$name', age=$age)"
    }


}

fun main() {
    val user = Usuario(1, "Jack Sparrow", 44)

// Getting a Property
    val name = user.name

// Setting a Property
    user.age = 46

    println(user)

// You cannot set read-only properties
//    user.id = 2	// Error: Val cannot be assigned
}