fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    when {
        m == 1 || m == 2 -> println("NEWBIE!")
        m <= n -> println("OLDBIE!")
        else -> println("TLE!")
    }
}
