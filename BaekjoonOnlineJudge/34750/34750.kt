fun main() {
    val input = readln().toLong()
    val result = when {
        input >= 1_000_000L -> input * 20 / 100
        input >= 500_000L   -> input * 15 / 100
        input >= 100_000L   -> input * 10 / 100
        else                -> input * 5 / 100
    }
    println("$result ${input - result}")
}
