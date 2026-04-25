fun main() {
    val (lvStr, judge) = readln().split(" ")
    val lv = lvStr.toInt()

    val score = when (judge) {
        "miss" -> 0
        "bad" -> 200 * lv
        "cool" -> 400 * lv
        "great" -> 600 * lv
        "perfect" -> 1000 * lv
        else -> 0
    }

    print(score)
}
