package com.example.bubble

fun bubbleSort(arr: Array<Int>) {
    val n = arr.size
    var swapped: Boolean
    // Outer loop for traversing the array
    for (i in 0 until n - 1) {
        swapped = false

        // Inner loop for comparing adjacent elements
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap arr[j] and arr[j + 1]
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = true
            }
        }


        // If no two elements were swapped in the inner loop, break
        if (!swapped) break
    }
}


fun main() {
    val arr = arrayOf(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: ${arr.joinToString()}")

    bubbleSort(arr)

    println("Sorted array: ${arr.joinToString()}")
}
