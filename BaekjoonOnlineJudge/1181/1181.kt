fun main() {
    val cnt = readln().toInt()
    val words = mutableSetOf<String>()

    repeat(cnt){
        words.add(readln())
    }

    words.sortedWith(compareBy({ it.length }, { it }))
        .forEach { println(it) }
}
