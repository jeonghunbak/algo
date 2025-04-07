data class Coordinate(val x: Int, val y: Int)

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<Coordinate>()

    repeat(cnt){
        val input = readln().split(" ").map { it.toInt() }
        arr.add(Coordinate(input[0], input[1]))
    }

    arr.sortWith(compareBy({ it.x }, { it.y }))

    arr.forEach { println("${it.x} ${it.y}") }
}
