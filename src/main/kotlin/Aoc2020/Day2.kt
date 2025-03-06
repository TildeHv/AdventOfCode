package Aoc2020

import java.io.File

data class Data(val min: Int, val max: Int, val label: Char, val value: String)

fun main() {
    val textFile = File("src/main/Year2020/InputDay2")
    val passwords = Passwords(textFile)

    val validPasswordsCount = calculatePassword(passwords)
    println("Lösning 1: $validPasswordsCount")

    val validPasswordsCount2 = calculatePassword2(passwords)
    println("Lösning 2: $validPasswordsCount2")
}

fun Passwords(textFile: File): List<Data> {
    return textFile.readLines()
        .map { line ->
            val parts = line.split(" ", "-", ":").filter { it.isNotEmpty() }
            Data(parts[0].toInt(), parts[1].toInt(), parts[2][0], parts[3])
        }
}

fun calculatePassword(passwords: List<Data>): Int {
    return passwords.count { data ->
        val count = data.value.count { it == data.label }
        count in data.min..data.max
    }
}

fun calculatePassword2(passwords: List<Data>): Int {
    return passwords.count { data ->
        val pos1Valid = data.value[data.min - 1] == data.label
        val pos2Valid = data.value[data.max - 1] == data.label
        pos1Valid != pos2Valid
    }
}
