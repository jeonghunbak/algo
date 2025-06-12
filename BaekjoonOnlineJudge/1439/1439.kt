fun main() {
    val input = readln()
    val map = mutableMapOf<Char, Int>(
        '0' to 0,
        '1' to 0
    )

    var target = input[0]

    input.forEach { it ->
        if(it != target) {
            map[target] = map.getValue(target) + 1
            target = it
        }
    }
    map[target] = map.getValue(target) + 1
    print(map.values.min())
}
