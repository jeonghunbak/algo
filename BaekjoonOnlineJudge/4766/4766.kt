fun main() {
    var prev = readln().toDouble()
    while (true) {
        val cur = readln().toDouble()
        if (cur == 999.0) break
        println(String.format("%.2f", cur - prev))
        prev = cur
    }
}
