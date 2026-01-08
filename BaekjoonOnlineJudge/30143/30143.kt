fun main() {
    val cnt = readln().toInt()

    repeat(cnt) {
        val (n, a, d) = readln().split(" ").map { it.toLong() }

        val total = n * a + d * (n * (n - 1) / 2)
        println(total)
    }
}
