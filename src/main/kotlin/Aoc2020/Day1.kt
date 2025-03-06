package Aoc2020

import java.io.File

fun main() {
    val input = File("src/main/Year2020/InputDay1").readLines()
    val numberList = convertToInt(input)

    println("Lösning 1: ${part1(numberList)}")
    println("Lösning 2: ${part2(numberList)}")
}

fun convertToInt(input: List<String>): List<Int> {
    return input.map { it.toInt() }
}

fun part1(input: List<Int>): Int {
    val solution1 = input
        .combinations(2)
        .firstOrNull { (a, b) -> a + b == 2020 }
        ?.let { (a, b) -> a * b }

    return solution1 ?: -1
}

fun part2(input: List<Int>): Int {
    val solution2 = input
        .combinations(3)
        .firstOrNull { (a, b, c) -> a + b + c == 2020 }
        ?.let { (a, b, c) -> a * b * c }

    return solution2 ?: -1
}

fun <T> List<T>.combinations(size: Int): Sequence<List<T>> = sequence {
    val listSize = this@combinations.size
    if (size > listSize) return@sequence

    val indices = IntArray(size)
    while (true) {
        yield(indices.map { this@combinations[it] })

        var i = size - 1
        while (i >= 0 && indices[i] == listSize - size + i) {
            i--
        }
        if (i < 0) break
        indices[i]++
        for (j in i + 1 until size) {
            indices[j] = indices[j - 1] + 1
        }
    }
}