package p05_Collections

/*
A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
For creating maps, there are functions mapOf() and mutableMapOf(). A read-only view of a mutable map
can be obtained by casting it to Map.
 */
/**
 * Creates a mutable Map.
Creates a read-only view of the Map.
Checks if the Map's key exists.
Reads the corresponding value and increments it with a constant value.
Iterates immutable Map and prints key/value pairs.
Reads the account points balance, before updates.
Updates an existing account two times.
Tries to update a non-existing account: prints an error message.
Reads the account points balance, after updates.
 */
const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // 5
            kk, v ->
        println("ID $kk: credit $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8
    accountsReport()                                                                    // 9
}