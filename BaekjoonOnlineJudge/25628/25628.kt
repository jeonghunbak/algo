import kotlin.math.min

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val c = a / 2
    println(min(b, c))
}
