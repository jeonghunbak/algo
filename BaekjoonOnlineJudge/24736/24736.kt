fun main() {
    val point = listOf<Int>(6, 3, 2, 1, 2)

    repeat(2) {
        val input = readln().split(" ").map { it.toInt() }
        val sum = input.zip(point).sumOf { (a, b) -> a * b }
        print("${sum} ")
    }
}
