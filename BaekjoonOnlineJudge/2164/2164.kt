import java.util.LinkedList
import java.util.Queue

fun main() {
    val num = readln().toInt()
    val queue: Queue<Int> = LinkedList()

    repeat(num) { index ->
        queue.offer( index + 1)
    }

    repeat(num - 1) {
        queue.poll()
        queue.offer(queue.poll())
    }
    println(queue.poll())
}
