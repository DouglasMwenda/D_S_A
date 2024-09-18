package com.example.Hackeranktests

import java.util.Scanner

fun comparativeTriplets3(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0
    for (i in 0..2) {
        when {
            a[i] > b[i] -> alice++
            a[i] < b[i] -> bob++
        }
    }

    return arrayOf(alice, bob)
}


fun main(args: Array<String>) {
    val result = comparativeTriplets3(arrayOf(1, 2, 4), arrayOf(3, 6, 10))
    println("${result[0]} ,${result[1]}")
}
