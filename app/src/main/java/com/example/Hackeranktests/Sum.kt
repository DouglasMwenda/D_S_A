package com.example.Hackeranktests

import java.util.Scanner
fun solveMeFirst(a: Int, b: Int): Int {
    return( a+b)

}
fun main(args: Array<String>) {
    val sc= Scanner(System.`in`)
    val num1=sc.nextInt()
    val num2=sc.nextInt()
    val sum=num1+num2
    solveMeFirst(num1,num2)
    println(sum)

}
