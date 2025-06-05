fun main() {
    val map = mutableMapOf(
        'H' to 0,
        'I' to 0,
        'A' to 0,
        'R' to 0,
        'C' to 0,
    )

    val cnt = readln().toInt()
    val str = readln()

    str.forEach { it ->
        if(map.containsKey(it)) {
            map[it] = map.getValue(it) + 1
        }
    }
    print(map.values.min())
}
