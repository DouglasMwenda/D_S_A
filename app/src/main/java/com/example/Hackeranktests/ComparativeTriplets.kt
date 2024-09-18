package com.example.Hackeranktests

import java.util.Scanner
fun comparativeTriplets(a: Array<Int>, b: Array<Int>) :Array<Int> {
    var alice = 0
    var bob = 0
for (i in 0..2){
    if (a[i]>b[i]){
        alice++
    }else if (a[i]<b[i]){
        bob++
    }
}
return arrayOf(alice,bob)
}


fun main(args: Array<String>) {
val a = arrayOf(3,4,7)
    val b = arrayOf(6,8,7)
    val result = comparativeTriplets(a,b)

    println("${result[0]} ,${result[1]}")
}
