fun main() {
    val n = readln().toInt()
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    println(result / 604800)
}
