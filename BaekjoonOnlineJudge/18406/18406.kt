fun main() {
    val input = readln()
    val mid = input.length / 2

    val first = input.substring(0, mid).toCharArray().sumOf { it.digitToInt() }
    val second = input.substring(mid).toCharArray().sumOf { it.digitToInt() }
    
    print(if (first == second) "LUCKY" else "READY")
}
