package p03_SpecialClases
/*
1 Creates a function with parameters.
2 Creates an object to use when calculating the result value.
3 Accesses the object's properties.
4 Prints the result.
5 Calls the function. This is when the object is actually created
 */
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {  //1

    val dayRates = object {   // Es como un objeto anonimo                                                   //2
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special       //3

    print("Total price: $$total")                                               //4

}

fun main() {
    rentPrice(10, 2, 1)                                                         //5
}