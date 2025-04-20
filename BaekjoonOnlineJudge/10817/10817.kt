fun main() {
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    input.sortDescending()
    print(input[1])
}
