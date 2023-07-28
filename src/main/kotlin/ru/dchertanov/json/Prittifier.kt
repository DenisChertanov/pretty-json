package ru.dchertanov.json

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val json = Json { prettyPrint = true }

fun makePretty(rawJson: String): String {
    val jsonObject = json.parseToJsonElement(rawJson)
    return json.encodeToString(jsonObject)
}