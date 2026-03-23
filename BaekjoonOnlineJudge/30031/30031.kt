fun main(){
    val cnt = readln().toInt()
    val map = mapOf(
        136 to 1000,
        142 to 5000,
        148 to 10000,
        154 to 50000
    )

    var answer = 0
    repeat(cnt) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        answer += map[a]!!
    }
    print(answer)
}
