fun checkStr(str: String): String {
    val stack = ArrayDeque<Char>()
    val matching = mapOf(')' to '(', ']' to '[')

    for (ch in str) {
        when (ch) {
            '(', '[' -> stack.addLast(ch)
            ')', ']' -> {
                if (stack.isEmpty() || stack.removeLast() != matching[ch]) {
                    return "no"
                }
            }
        }
    }

    return if(stack.isEmpty()) "yes" else "no"
}

fun main() {

    while (true) {
        val input = readln()

        if(input == ".") break

        val output = input.replace("[^()\\[\\]]".toRegex(), "")
        println(if(output != "") checkStr(output) else "yes")
    }
}
