fun main() {
    val (m, d) = readln().split(" ").map { it.toInt() }
    println((d + m - 1) / m)
}
