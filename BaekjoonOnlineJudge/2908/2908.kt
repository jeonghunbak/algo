fun main() {
    println(readln().split(" ").maxOfOrNull { it.reversed().toInt() })
}
