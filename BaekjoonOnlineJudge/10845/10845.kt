fun main() {
    val cnt = readln().toInt()
    val queue = ArrayDeque<Int>()
    val sb = StringBuilder()

    repeat(cnt){
        val command = readln().split(" ")
        when (command[0]) {
            "push" -> queue.addLast(command[1].toInt())
            "pop" -> sb.appendLine(queue.removeFirstOrNull() ?: -1)
            "size" -> sb.appendLine(queue.size)
            "empty" -> sb.appendLine(if (queue.isEmpty()) 1 else 0)
            "front" -> sb.appendLine(queue.firstOrNull() ?: -1)
            "back" -> sb.appendLine(queue.lastOrNull() ?: -1)
        }
    }
    print(sb.toString())
}
