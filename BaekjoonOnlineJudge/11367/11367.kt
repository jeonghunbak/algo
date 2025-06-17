fun getGrade(score: Int): String {
    return when (score) {
        in 97..100 -> "A+"
        in 90..96 -> "A"
        in 87..89 -> "B+"
        in 80..86 -> "B"
        in 77..79 -> "C+"
        in 70..76 -> "C"
        in 67..69 -> "D+"
        in 60..66 -> "D"
        in 0..59 -> "F"
        else -> ""
    }
}

fun main() {
    val cnt =readln().toInt()

    repeat(cnt){
        val (name, score) = readln().split(" ")
        
        println("$name ${getGrade(score.toInt())}")
    }
}
