package kesteli.filip

import java.util.*

/**
 * Glavna izvršna funkcija
 **/
fun main(args: Array<String>) {
    println(razlika(2, 5))
    println(zbroj(1, 6))
    varijableIOstalo()
    petljeIGrananja()
    println(grananjeWhen("Jabuka"))
}

/**
 * Regularno definiranje funkcije
 */
fun razlika(a: Int, b: Int): Int {
    return a - b
}

/**
 * Alternativno definiranje funkcije
 */
fun zbroj(a: Int, b: Int) = a + b

/**
 *
 */
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a + $b is ${a + b}")
}


fun varijableIOstalo() {
    // Mutable variables - nepromijenjive varijable
    val a: Int = 1 //direktno definiranje i dodjeljivanje vrijednosti
    val b = 2 // Int tip je shvaćen od strane računala
    val c: Int // Tip je bitno definirati kada se vrijednost ne dodijeli
    c = 2
    // Immutable variables - promijenjive varijable
    var x = 5 // Int je shvaćen od računala
    x += 1
    //Koristenje stringova
    var y = 24
    var s1 = "Filip ima $y godine"
    y = 25
    val s2 = "${s1.replace("ima", "je imao")}, no sada ima $y godina."
    println(s2)
    val d: Int = 21
    val e: Int = 24
    if (d < e) {
        println(d)
    } else {
        println(e)
    }
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

/**
 * foreach loop
 * while loop
 * Bitno je primjetiti kako su step, downTo lambda izrazi (funkcije) - sa lambdama se radi čudo u jeziku
 * break-a se u slučaju kada se u when-u nađe točna vrijesnost
 */
fun petljeIGrananja() {
    val items = listOf<String>("apple", "banana", "kiwi")
    //obična foreach petlja
    for (item in items) {
        println(item)
    }
    //caka ako želim znati indekse
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
    var index = 0
//    while petlja
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
    val list: List<String> = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("List size is also out of valid range too!")
    }
    for (x in 0..5) {
        print(x)
    }
    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 4) {
        print(x)
    }
    println()
    for (item in items) {
        println(item)
    }
    when {
        "banana" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    val fruits = items
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}

/**
 * break-a se u slučaju kada se u when-u nađe točna vrijesnost
 */
fun grananjeWhen(obj: Any): String {
    //    when grananje
    return when (obj) {
        1 -> "One"
        is Long -> "Long"
        !is String -> "Nije string"
        "Jabuka" -> "Jabuka"
        else -> "Unknown"
    }
}

