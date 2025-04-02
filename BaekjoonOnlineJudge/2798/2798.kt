fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val cards = readln().split(" ").map { it.toInt() }
    var answer = 0

    for (i in 0 until input[0] - 2){
        for(j in i + 1 until input[0] - 1){
            for (k in j + 1 until input[0]){
                val sum = cards[i] + cards[j] + cards[k]

                if (sum <= input[1] && sum > answer) {
                    answer = sum
                }
            }
        }
    }
    println(answer)
}
