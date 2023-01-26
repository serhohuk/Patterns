package singleton

import singleton.JavaSingleton
import singleton.SingletonExample

fun main(args: Array<String>) {
//    val singletonExample1 = SingletonExample.getInstance()
//    val singletonExample2 = SingletonExample.getInstance()

//    singletonExample1.work()
//    singletonExample2.work()
//    println(singletonExample1.toString())
//    println(singletonExample2.toString())


    // No synchronized example
    val thread1 = Thread {
        val singleton1 = SingletonExample.getInstance()
        println(singleton1.toString())
    }
    val thread2 = Thread {
        val singleton2 = SingletonExample.getInstance()
        println(singleton2.toString())
    }
    thread1.start()
    thread2.start()

    //Synchronized example
    val threadJava1 = Thread {
        val singleton1 = JavaSingleton.getInstance()
        println(singleton1.toString())
    }
    val threadJava2 = Thread {
        val singleton2 = JavaSingleton.getInstance()
        println(singleton2.toString())
    }
    threadJava1.start()
    threadJava2.start()
}