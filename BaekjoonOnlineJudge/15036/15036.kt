fun main() {
    readln().toInt()
    val input = readln().split(" ").map(String::toInt)
    val map = mapOf<Int, Double>(
        0 to 2.0,
        1 to 1.0,
        2 to 0.5,
        4 to 0.25,
        8 to 0.125,
        16 to 0.0625
    )

    var answer: Double = 0.0

    for(item in input) {
        answer += map.getValue(item)
    }
    println(answer.toString().removeSuffix(".0"))
}
