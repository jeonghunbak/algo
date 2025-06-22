fun main() {
    val input = readln().toInt()

    repeat(input) {
        println("@@@@@".repeat(input))
    }

    repeat(input * 4) {
        println("@".repeat(input))
    }
}
