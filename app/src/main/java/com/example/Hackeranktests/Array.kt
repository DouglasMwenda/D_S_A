package com.example.Hackeranktests

import java.util.Scanner


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val arCount = sc.nextLine().trim().toInt()
    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }.toTypedArray()
    val result = simpleArraySum(arr)
    println(result)

    // can either use the above or the below but the above is more efficient and concise
    //val arr= arrayOf(1,2,3,4,10,11)
    //  println(simpleArraySum(arr))
}

fun simpleArraySum(arr: Array<Int>): Int {
    var sum = 0
    for (i in arr) {
        sum += i
    }
    return sum
}
