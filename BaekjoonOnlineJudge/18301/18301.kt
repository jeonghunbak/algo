fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() + 1 }
    print((a * b) / c - 1)
}
