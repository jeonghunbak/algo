import java.math.BigInteger

fun factorial(start: Int, end: Int): BigInteger {
    if (start > end) return BigInteger.ONE
    if (start == end) return BigInteger.valueOf(start.toLong())
    val mid = (start + end) / 2
    return factorial(start, mid).multiply(factorial(mid + 1, end))
}

fun main() {
    val n = readln().toInt()
    if (n == 0 || n == 1) println(1)
    else println(factorial(1, n))
}
