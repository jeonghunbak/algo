fun main() {
    val (a, b) = readln().split(" ")

    val sumA = a.sumOf { it.digitToInt().toLong() }
    val sumB = b.sumOf { it.digitToInt().toLong() }

    println(sumA * sumB)
}
