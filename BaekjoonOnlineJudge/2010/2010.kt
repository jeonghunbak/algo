fun main() {
    val cnt = readln().toInt()
    var answer = 0

    repeat(cnt){ index ->
        val line = readln().toInt()

        if(index == 0) {
            answer += line
        } else {
            answer += (line - 1)
        }
    }
    print(answer)
}
