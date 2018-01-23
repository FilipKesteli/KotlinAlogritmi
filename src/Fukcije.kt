import java.util.ArrayList

fun main(args: Array<String>) {
    var x: Double
    x = double(7).toDouble()
    println(x)
    x = exponentialFunction(2.0, 5.0)
    println(x)
    x = read(listOf<Byte>(0, 1, 0, 0, 1, 100, 111).toTypedArray(), 45).toDouble()
    println(x)
    promijenjiviArgumenti(strings = *arrayOf("a", "b", "c"))
    val list = asList(1, 2, 3)
    println(list)
    val y = kvadratnaFunkcija<Int>(5, 2, 3)
    for (i in y) {
        print("$i ")
    }
    val y2 = kvadratnaFunkcija<Double>(1.2, 3.2, 5.2)
    for (i in y2) {
        print(i)
    }
    println("5! = ${fact(5)}")
}

fun double(x: Int): Int {
    return 2 * x
}

fun exponentialFunction(base: Double, exponent: Double): Double {
    return Math.pow(base, exponent)
}

fun read(b: Array<Byte>, off: Int, len: Int = b.size): Int {
    return len
}

fun sve(
        a: Int = 2,
        b: Double = 2.0,
        c: Byte = 111,
        d: String = "Pocetni uvjet",
        e: Char = 'f',
        f: Float = 2.21F,
        g: Long = 2141L,
        h: Short = 11001
): String {
    return when (a) {
        2 -> "a"
        7 -> "523"
        else -> "sve"
    }
    val x = when (a) {
        2 -> "a"
        7 -> "523"
        else -> "sve"
    }
}

fun racionalnaFunkcija(a: Double = 2.0, b: Double = 3.0, c: Double, d: Double, f: () -> Double, g: () -> Double): Double {
    return when {
        a < 0 -> 2.1
        a > 0 -> 2.3
        else -> 0.0
    }
}

fun promijenjiviArgumenti(vararg strings: String): Array<out String> {
    println(strings)
    return strings
}

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

/*
fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: Set<Vertex>) {
        if () {
        }
    }
}*/


fun <T> kvadratnaFunkcija(a: T, b: T, c: T): List<T> {
    var lista: List<T> = listOf(a, b, c)
    println("${a}x^2+${b}x+$c")
    return lista
}

tailrec fun findFixPoint(x: Double = 1.0): Double =
        if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return y
        x = y
    }
}


