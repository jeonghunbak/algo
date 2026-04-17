fun main() {
    while (true) {
        val (x, y) = readln().trim().split(Regex("\\s+")).map { it.toDouble() }

        when {
            x == 0.0 || y == 0.0 -> println("AXIS")
            x > 0 && y > 0 -> println("Q1")
            x < 0 && y > 0 -> println("Q2")
            x < 0 && y < 0 -> println("Q3")
            else -> println("Q4")
        }

        if (x == 0.0 && y == 0.0) break
    }
}
