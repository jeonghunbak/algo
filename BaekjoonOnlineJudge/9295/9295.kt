fun main() {
    val cnt = readln().toInt()
    repeat(cnt) { index ->
       val input = readln().split(" ").map { it.toInt() }
       println("Case ${index + 1}: ${input.sum()}")
    }
}
