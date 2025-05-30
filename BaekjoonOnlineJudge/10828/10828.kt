fun main() {
    val cnt = readln().toInt()
    val stack = ArrayDeque<Int>()
    val sb = StringBuilder()

    repeat(cnt){
        val command = readln().split(" ")
        when (command[0]) {
            "push" -> stack.addLast(command[1].toInt())
            "pop" -> sb.appendLine(stack.removeLastOrNull() ?: -1)
            "size" -> sb.appendLine(stack.size)
            "empty" -> sb.appendLine(if (stack.isEmpty()) 1 else 0)
            "top" -> sb.appendLine(stack.lastOrNull() ?: -1)
        }
    }
    print(sb.toString())
}
