fun main() {
    val n = readln().toInt()
    val answer = (0 until n).count {
        val (a, b, c, d) = readln().split(" ").map(String::toInt)
        a >= 1000 || b >= 1600 || c >= 1500 || d in 1..30
    }
    println(answer)
}
