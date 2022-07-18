package ru.dchertanov.json

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject

private val json = Json { prettyPrint = true }

fun makePretty(rawJson: String): String {
    val jsonObject = json.decodeFromString<JsonObject>(rawJson)
    return json.encodeToString(jsonObject)
}