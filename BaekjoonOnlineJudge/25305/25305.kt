fun main() {
    val (entry, cutOffScore) = readln().split(" ").map { it.toInt() }
    val score = readln().split(" ").map { it.toInt() }.toMutableList()

    score.sortDescending()

    print(score[cutOffScore - 1])
}
