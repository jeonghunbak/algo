fun main() {
    val (a, b, c) = readln().split(" ").map { it.toLong() }
    val row = (a + c - 1) / c
    val column = (b + c - 1) / c

    println(row * column)
}
