fun main() {
    val vacation = readln().toInt()
    val koreanTotal = readln().toInt()
    val mathTotal = readln().toInt()
    val koreanPerDay = readln().toInt()
    val mathPerDay = readln().toInt()

    fun ceilDiv(total: Int, perDay: Int) = (total + perDay - 1) / perDay

    val koreanDays = ceilDiv(koreanTotal, koreanPerDay)
    val mathDays = ceilDiv(mathTotal, mathPerDay)

    val studyDays = maxOf(koreanDays, mathDays)
    val restDays = vacation - studyDays

    println(restDays)
}
