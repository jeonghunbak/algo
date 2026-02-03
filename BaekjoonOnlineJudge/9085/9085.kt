fun main() {
    val cnt = readln().toInt()
    repeat(cnt) {
        readln()
        println(readln().split(" ").sumOf { it.toInt() })
    }
}
