import kotlin.math.min

fun main() {
    val n = readln().trim().toInt()
    val (a, b, c) = readln().trim().split(" ").map { it.toInt() }

    val answer = min(n, a) + min(n, b) + min(n, c)
    print(answer)
}
