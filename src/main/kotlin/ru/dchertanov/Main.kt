package ru.dchertanov

import ru.dchertanov.json.makePretty

fun main(args: Array<String>) {
    val rawJson = String(System.`in`.readAllBytes())

    try {
        print(makePretty(rawJson))
    } catch (e: Exception) {
        print(rawJson)
    }
}