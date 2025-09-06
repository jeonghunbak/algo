fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    print((3 * b * c) / a)
}
