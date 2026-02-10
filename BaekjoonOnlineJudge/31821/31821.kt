fun main() {
    val n = readln().toInt()
    val prices = IntArray(n)
    for (i in 0 until n) {
        prices[i] = readln().toInt()
    }

    val m = readln().toInt()
    var sum = 0
    repeat(m) {
        val idx = readln().toInt()
        sum += prices[idx - 1]
    }

    print(sum)
}
