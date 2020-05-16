package p01_introduction

class Usuario(_id: Int, _name: String, _age: Int) {
    val id: Int = _id

    var name: String = _name
        // Custom Getter
        get() {
            return field.toUpperCase()
        }

    var age: Int = _age
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main(args: Array<String>) {
    val usuario = Usuario(1, "Jack Sparrow", 44)

    println("${usuario.name}") // JACK SPARROW

    usuario.age = -1           // Throws IllegalArgumentException: Age must be greater that zero
}