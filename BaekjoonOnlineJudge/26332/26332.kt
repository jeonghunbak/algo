fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (c, p) = readln().split(" ").map { it.toInt() }
        val total = c * p - 2 * (c - 1)
        println("$c $p")
        println(total)
    }
}
