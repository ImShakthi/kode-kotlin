package com.imshakthi.hackerearth.basics

fun main() {
    println("Zoo")

    val input = readLine()!!
    val result = if (isZoo(input)) "Yes" else "No"
    println(result)
}

fun isZoo(input: String): Boolean {
    if (input.count { it == 'z' }.times(2) != input.count { it == 'o' }) {
        return false
    }
    return input.zipWithNext().any { it.first == 'o' && it.second == 'z' }.not()
}