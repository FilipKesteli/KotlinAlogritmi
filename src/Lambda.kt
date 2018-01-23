fun main(args: Array<String>) {
    val x = sum(2, 3)
    println(x)
}

val sum = { x: Int, y: Int -> x + y }