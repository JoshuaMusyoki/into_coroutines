package org.example

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
//    doWork2()
    doWork3()
    println("Done")
}

suspend fun doWork(){
    delay(1000L)
    println("Hurray")
}

//using coroutine scope
suspend fun doWork2() = coroutineScope{
    launch {
        delay(1000L)
        println("Hurray!!")
    }
    println("Oya")
}

//scope builder and concurrency
suspend fun doWork3() = coroutineScope {
    launch {
        delay(2000L)
        println("Good Morning")
    }
    launch {
        delay(1000L)
        println("Good Afternoon")
    }
    println("Joshua!!")
}