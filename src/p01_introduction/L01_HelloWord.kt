package p01_introduction

/*

 1- Kotlin code is usually defined in packages. Package specification is optional:
    you don't specify a package in a source file, its content goes to the default package.
 2- An entry point to a Kotlin application is the main function.
    In Kotlin 1.3, you can declare main without any parameters.
    The return type is not specified, which means that the function returns nothing.
 3- println writes a line to the standard output. It is imported implicitly. Also note that semicolons are optional.


In Kotlin versions earlier than 1.3, the main function must have a parameter of type Array<String>.

*/

//fun main(args: Array<String>) {
fun main() {                        // 2
    println("Hello, World!")        // 3
}