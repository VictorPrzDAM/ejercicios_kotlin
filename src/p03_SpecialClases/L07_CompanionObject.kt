package p03_SpecialClases

/*
companion object
Syntactically it's similar to the static methods in java.
  1 Defines a class.
  2 Defines a companion. Its name can be omitted.
  3 Defines a companion object method.
  4 Calls the companion object method via the class name.
*/
class BigBen {                                  //1
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                         //4
}