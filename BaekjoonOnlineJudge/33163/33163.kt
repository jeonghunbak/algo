fun main() {
    readln()
    val s = readln()
    val sb = StringBuilder()
    for (c in s) {
        sb.append(
            when (c) {
                'J' -> 'O'
                'O' -> 'I'
                else -> 'J'
            }
        )
    }
    print(sb)
}
