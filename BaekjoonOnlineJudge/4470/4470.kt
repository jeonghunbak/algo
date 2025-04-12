fun main() {
    val cnt = readln().toInt()

    repeat(cnt){ index ->
        val input = readln()
        println("${index + 1}. ${input}")
    }
}
