fun main() {
    val times = listOf(3, 20, 120)

    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }

    val sumA = a.zip(times).sumOf { (x, t) -> x * t }
    val sumB = b.zip(times).sumOf { (x, t) -> x * t }

    println(
        when {
            sumA > sumB -> "Max"
            sumA < sumB -> "Mel"
            else -> "Draw"
        }
    )
}
