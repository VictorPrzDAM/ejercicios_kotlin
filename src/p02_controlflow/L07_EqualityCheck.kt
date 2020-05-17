package p02_controlflow


/*
1 Returns true because it calls authors.equals(writers) and sets ignore element order.
2 Returns false because authors and writers are distinct references.
 */
fun main(args: Array<String>) {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1 no tiene en cuenta el orden TRUE
    println(authors === writers)  // 2 si tiene en cuenta el orden FALSE
}
