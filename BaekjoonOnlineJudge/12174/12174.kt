fun main() {
    val cnt = readln().toInt()

    repeat(cnt) { index ->
        val codeCnt = readln().toInt()
        val code = readln().replace("I", "1").replace("O", "0").chunked(8)
        var sentence = ""

        code.forEach { it ->
            sentence += it.toInt(2).toChar()
        }

        println("Case #${index + 1}: $sentence")
    }
}
