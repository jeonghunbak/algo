fun main() {
    val cnt = readln().toInt()

    repeat(cnt){
        val (idx, day) = readln().split(" ").map { it.toInt() }
        var answer = 0
        repeat(day) { it ->
            answer += (it + 1)
        }
        answer += day
        println("$idx $answer")
    }
}
