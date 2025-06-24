data class doc(val index: Int, val priority: Int)

fun main() {
    val cnt = readln().toInt()

    repeat(cnt){
        val (len, idx) = readln().split(" ").map { it.toInt() }
        val list = readln().split(" ").map { it.toInt() }
        var answer = 0
        val deque = ArrayDeque<doc>()
        val priorityArr = IntArray(10)

        list.forEachIndexed { index, item ->
            deque.addLast(doc(index, item))
            priorityArr[item]++
        }

        while(true){
            val first = deque.removeFirst()

            var maxPriority = 0
            for (i in 9 downTo 1){
                if(priorityArr[i] > 0){
                    maxPriority = i
                    break
                }
            }

            if(first.priority < maxPriority){
                deque.addLast(first)
            } else {
                answer++
                priorityArr[first.priority]--

                if(first.index == idx){
                    println(answer)
                    break
                }
            }
        }
    }
}
