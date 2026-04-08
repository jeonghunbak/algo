fun main() {
    val (n, m, k) = readLine()!!.split(" ").map { it.toInt() }
    println(minOf(m, k) + minOf(n - m, n - k))
}
