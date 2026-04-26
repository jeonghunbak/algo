fun main() {
    val (a, b, c) = readln()
        .filter { it.isDigit() }
        .map { it.digitToInt() }

    println(if (a + b == c) "YES" else "NO")
}
