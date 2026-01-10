fun main() {
    val cnt = readln().toInt()

    repeat(cnt) {
        val s = readln()
        var answer = 0

        for (i in 0 until s.length - 2) {
            if (s[i] == 'W' && s[i + 1] == 'O' && s[i + 2] == 'W') {
                answer++
            }
        }
        println(answer)
    }
}
