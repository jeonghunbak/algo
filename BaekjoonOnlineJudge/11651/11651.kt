data class coordinate(val x: Int, val y: Int)

fun main() {
    val cnt = readln().toInt()
    var arr = mutableListOf<coordinate>()

    repeat(cnt){
        val input = readln().split(" ").map { it.toInt() }
        arr.add(coordinate(input[0], input[1]))
    }

    arr.sortWith(compareBy({ it.y }, { it.x }))

    arr.forEach { println("${it.x} ${it.y}") }
}
