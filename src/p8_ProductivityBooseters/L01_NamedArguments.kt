package p8_ProductivityBooseters

fun format(userName: String, domain: String) = "$userName@$domain"

fun main() {
    println(format("mario", "example.com"))                         // 1
    println(format("domain.com", "username"))                       // 2
    println(format(userName = "foo", domain = "bar.com"))           // 3
    println(format(domain = "frog.com", userName = "pepe"))         // 4


    val greeting = "Kotliner"

    println("Hello $greeting")                  // 1
    println("Hello ${greeting.toUpperCase()}")  // 2
}