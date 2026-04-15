fun main() {
    val input = readln().toInt()
    val p = 5 * input - 400
    
    println(p)
    println(
        when {
            p > 100 -> -1
            p == 100 -> 0
            else -> 1
        }
    )
}
