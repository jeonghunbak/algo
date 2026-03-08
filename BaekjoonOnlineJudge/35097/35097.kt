fun main() {
    while (true) {
        val n = readln().toInt()
        if (n == 0) break

        var sum = 0

        for (a in 1..n) {
            for (b in 1..n) {
                sum += a * b
            }
        }

        println(sum)
    }
}
