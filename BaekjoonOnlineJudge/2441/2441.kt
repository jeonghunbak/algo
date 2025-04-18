fun main() {
    val cnt = readln().toInt()

    repeat(cnt) { index ->
        println(" ".repeat(index) + "*".repeat(cnt - index))
    }
}
