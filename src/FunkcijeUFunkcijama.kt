fun main(args: Array<String>) {
    val h = { x: Int, y: Int -> x + y }
    val a: Int
    val b: Int
    f(h)
    f(sum)
    f { i, j -> i + j }
    val t = r({ i, j -> i + j }, { i, j -> i + j }, 2)
    println(t)
    val mult3 = makeMathFunction(3)
    println("5 * 3 = ${mult3(5)}")
    val multiply2 = { num1: Int -> num1 * 2 }
    val numList2 = arrayOf(1, 2, 3, 4, 5)
    mathOnList(numList2, multiply2)
}

fun f(g: (Int, Int) -> Int) {
    println(g)
}

/**
 * Slazem funkciju koja je jedna funkcija uz jedan uvjet, a druga funkcija uz drugi - trebam paziti na sintaksu!
 * Primjecujem kako ne mogu dodati vrijednost funkciji - ne mogu zbrajati funkcije
 * Trebao bih sloziti klasu objekata koji imaju overloadani operator zbrajanja funkcija
 */
fun r(s: (Int, Int) -> Int, p: (Int, Int) -> Int, x: Int = 7): (Int, Int) -> Int {
    return if (x > 0) {
        s
    } else {
        p
    }
}

/**
 * Slazem funkciju ciji ce parametar biti dio outputa funkcije koja je output prve
 */
fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

/**
 * Koristimo parametar unutar funkcije-parametra
 */
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunc(num)}")
    }
}

