import kotlin.math.PI

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (a1, p1) = readln().split(" ").map { it.toDouble() }
        val (r1, p2) = readln().split(" ").map { it.toDouble() }

        val slice = a1 / p1
        val whole = PI * r1 * r1 / p2

        if (slice > whole) println("Slice of pizza")
        else println("Whole pizza")
    }
}
