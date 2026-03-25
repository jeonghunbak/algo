fun main() {
    val arr = readln().split(" ").map { it.toInt() }.sorted()
    val x = arr[0]
    val y = arr[1]
    val z = arr[2]

    if (x + y > z) {
        println(x + y + z)
    } else {
        println(2 * (x + y) - 1)
    }
}
