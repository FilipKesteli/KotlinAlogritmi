fun main(args: Array<String>) {
    val box: Box<Int> = Box<Int>(156)
    println(box)
}

class Box<T>(t: T) {
    var value = t
}


