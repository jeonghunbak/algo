fun main() {
    val cnt = readln().toInt()
    val answer = mutableListOf<Int>()

    repeat(cnt) {
        val input = readln().split(" ").map { it.toInt() }
        val first = input.take(2).max()
        val last = input.takeLast(5).sortedDescending().take(2).sum()

        answer.add(first + last)
    }
    print(answer.max())
}
