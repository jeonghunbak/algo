fun main() {
    val dealerCnt = readln().toInt()
    val dealerCards = readln().split(" ").map { it.toInt() }

    val playerCnt = readln().toInt()
    val playerCards = readln().split(" ").map { it.toInt() }

    val dealerMap = dealerCards.groupingBy { it }.eachCount()

    val result = playerCards.map { dealerMap[it] ?: 0 }

    print(result.joinToString(" "))
}
