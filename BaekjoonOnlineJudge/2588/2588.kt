fun main() {
    val a = readln().toInt()
    val b = readln()

    for (i in 2 downTo 0) {
        val num = b[i].digitToInt()
        println(a * num)
    }
    println(a * b.toInt())
}
