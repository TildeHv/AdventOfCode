package Aoc2021

import java.io.File

fun main() {
    val textfile = File("src/main/Year2021/InputDay1").readLines()
    val inputInt = DepthMeasurement(textfile)

    val timesNumberIncreases = Part1(inputInt)
    println("Lösning 1: $timesNumberIncreases")

    val timesNumberIncreases2 = Part2(inputInt)
    println("Lösning 2: $timesNumberIncreases2")

}

fun DepthMeasurement(textfile: List<String>): List<Int> {
    val input = textfile.filterNot { it.isEmpty() }.map { it.toInt() }
    return input
}

fun Part1(input: List<Int>): Int {
    return input.windowed(2).count { it.get(1) > it.get(0) }
}

fun Part2(input: List<Int>): Int {
    return input.windowed(3).map { it.sum() }.windowed(2).count { it.get(1) > it.get(0) }
}