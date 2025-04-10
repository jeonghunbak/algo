data class Point(val s: Int, val c: Int, val l: Int, val num: Int)

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<Point>()

    repeat(cnt) { index ->
        val input = readln().split(" ").map { it.toInt() }
        arr.add(Point(input[0], input[1], input[2], index + 1))
    }

    arr.sortWith(compareByDescending<Point>({ it.s }).thenBy { it.c }.thenBy { it.l })

    println(arr[0].num)
}
