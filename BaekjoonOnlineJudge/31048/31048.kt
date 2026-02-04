fun main() {
    val cnt = readln().toInt()
    repeat(cnt) {
        val input = readln().toInt()
        println(
            when (input) {
                0, 1 -> 1
                2 -> 2
                3 -> 6
                4 -> 4
                else -> 0
            }
        )
    }
}
