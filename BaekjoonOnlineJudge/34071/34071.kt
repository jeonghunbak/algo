fun main() {
    val cnt = readln().toInt()
    val list = List(cnt) { readln().toInt() }

    val min = list.minOrNull()!!
    val max = list.maxOrNull()!!

    println(
        when (list[0]) {
            min -> "ez"
            max -> "hard"
            else -> "?"
        }
    )
}
