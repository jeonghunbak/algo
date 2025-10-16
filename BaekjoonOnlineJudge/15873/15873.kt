fun main() {
    val s = readln()
    val result = when {
        s.startsWith("10") -> 10 + s.substring(2).toInt()
        s.endsWith("10") -> s.substring(0, 1).toInt() + 10
        else -> s.substring(0, 1).toInt() + s.substring(1).toInt()
    }
    println(result)
}
