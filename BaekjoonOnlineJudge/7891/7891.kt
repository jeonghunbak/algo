fun main() {
    val cnt = readln().toInt()

    repeat(cnt) {
        val sum = readln().split(" ").sumOf { it.toInt() }
        println(sum)
    }
}
