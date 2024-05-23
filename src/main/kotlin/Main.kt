package org.example

import kotlinx.coroutines.*


fun main() = runBlocking {
    repeat(50_000) {
        launch {
            delay(5000L)
            println("Hurray!! It Works.")
        }
        println("Hello World!!")
    }
}