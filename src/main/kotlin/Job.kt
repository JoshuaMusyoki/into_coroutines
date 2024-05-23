package org.example

import kotlinx.coroutines.*

//Function demonstrating an explicit job
fun main() = runBlocking {
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("John")
    }
    println("Hello")
    job.join()
    println("Done") // wait until child coroutine completes
}