fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()

    var time = 0

    if (a >= b) {
        time = 0
    } else {
        when {
            a < 0 -> {
                time = if (b <= 0) {
                    (b - a) * c
                } else {
                    (-a) * c + d + b * e
                }
            }
            a == 0 -> {
                time = minOf(b * e, d + b * e)
            }
            else -> {
                time = (b - a) * e
            }
        }
    }

    println(time)
}
