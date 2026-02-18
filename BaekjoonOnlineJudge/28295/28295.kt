fun main() {
    var dir = 0 // 0=N, 1=E, 2=S, 3=W

    repeat(10) {
        when (readln().trim().toInt()) {
            1 -> dir += 1
            2 -> dir += 2
            3 -> dir += 3
        }
    }
    dir %= 4

    val result = when (dir) {
        0 -> "N"
        1 -> "E"
        2 -> "S"
        else -> "W"
    }
    println(result)
}
