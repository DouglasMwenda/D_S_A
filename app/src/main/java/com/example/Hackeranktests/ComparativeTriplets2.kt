package com.example.Hackeranktests

import java.util.Scanner

// Function to compare two arrays and count the number of times each array has a higher value
fun comparativeTriplets2(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0

    // Iterate through the indices 0 to 2 (assuming arrays have exactly 3 elements each)
    for (i in 0..2) {
        when {
            a[i] > b[i] -> alice++
            a[i] < b[i] -> bob++
        }
    }

    // Return the results as an array of two integers
    return arrayOf(alice, bob)
}

fun main() {
    // Example arrays for testing
    val aliceScores = arrayOf(4, 5, 6)
    val bobScores = arrayOf(3, 6, 10)

    // Call the comparativeTriplets function and print the result
    val result = comparativeTriplets2(aliceScores, bobScores)
    println(result.joinToString(" ")) // Print the result as space-separated values
}
