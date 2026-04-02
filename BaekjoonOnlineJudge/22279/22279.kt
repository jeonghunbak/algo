fun main() {
    val n = readln().toInt()
    var sum = 0.0
    repeat(n) {
        val (q, y) = readln().split(" ").map { it.toDouble() }
        sum += q * y
    }
    println("%.3f".format(sum))
}
