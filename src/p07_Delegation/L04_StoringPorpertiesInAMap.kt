package p07_Delegation

class User(val map: Map<String, Any?>) {
    val name: String by map                // 1
    val age: Int     by map                // 1
}

fun main() {
      val  map = mapOf(
            "name" to "John Doe",
            "age"  to 33
        )
    val user = User(map
    )

    println("name = ${user.name}, age = ${user.age}")
    println("name = ${user.map.keys }, age = ${user.age}")
}