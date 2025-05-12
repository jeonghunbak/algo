fun main() {
    val coinValues = intArrayOf(25, 10, 5, 1)
    val cnt = readln().toInt()

    repeat(cnt) {
        var input = readln().toInt()
        val result = coinValues.map { coin ->
            val count = input / coin
            input %= coin
            count
        }
        println(result.joinToString(" "))
    }
}
