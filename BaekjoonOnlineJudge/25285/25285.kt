import kotlin.math.pow

fun main() {
    val cnt = readln().toInt()

    repeat(cnt) {
        val(height, weight) = readln().split(" ").map { it.toInt() }
        val bmi = weight.toDouble() / (height.toDouble() / 100).pow(2)

        when {
            height <= 140 -> println(6)
            height in 141..145 -> println(5)
            height in 146..158 -> println(4)
            height in 159..160 -> {
                if (bmi >= 16.0 && bmi < 35.0) println(3)
                else println(4)
            }
            height in 161..203 -> {
                when {
                    bmi >= 20.0 && bmi < 25.0 -> println(1)
                    (bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0) -> println(2)
                    (bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0) -> println(3)
                    else -> println(4)
                }
            }
            else -> println(4)
        }
    }
}
