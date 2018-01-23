fun main(args: Array<String>) {
    println("5! = ${fact(5)}")
}

/**
 * Ovo je funkcija unutar koje je rekurzivna funkcija
 */
fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}

//fun fact1(x: Double, )