fun main (){
    val cnt = readln().toInt()
    val map = mutableMapOf<Long, Int>()

    repeat(cnt){
        val input = readln().toLong()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    val maxElement = map.values.maxOrNull()

    if (maxElement != null) {
        val answer = map.filterValues { it == maxElement }
            .keys
            .minOrNull()

        print(answer)
    }
}
