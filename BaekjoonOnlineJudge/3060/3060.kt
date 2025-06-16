fun main() {
    val cnt = readln().toInt()
//    왼쪽 돼지: pigs[(i - 1 + 6) % 6]
//    오른쪽 돼지: pigs[(i + 1) % 6]
//    맞은편 돼지: pigs[(i + 3) % 6]
    repeat(cnt){
        // 다음 날 총 먹이 양은 전날 총 먹이 양의 4배
        val feed = readln().toInt()
        var figsFeed = readln().split(" ").sumOf { it.toInt() }
        var day = 1

        while(figsFeed <= feed){
            figsFeed *= 4
            day++
        }
        println(day)
    }
}
