import kotlin.math.pow

fun main() {
    val n = readln().toInt()
    val PI = 3.14159
    var max = 0.0

    repeat(n) {
        val input = readln().split(" ")
        val type = input[0]

        when (type) {
            "C" -> {
                val r = input[1].toDouble()
                val h = input[2].toDouble()
                val volume = (1.0 / 3.0) * PI * r.pow(2) * h
                if (volume > max) {
                    max = volume
                }
            }
            "L" -> {
                val r = input[1].toDouble()
                val h = input[2].toDouble()
                val volume = PI * r.pow(2) * h
                if (volume > max) {
                    max = volume
                }
            }
            "S" -> {
                val r = input[1].toDouble()
                val volume = (4.0 / 3.0) * PI * r.pow(3)
                if (volume > max) {
                    max = volume
                }
            }
        }
    }
    println(String.format("%.3f", max))
}
