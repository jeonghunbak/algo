fun main() {
    val arr = readln().split(" ").map { it.toInt() }.sorted()
    val answer = maxOf(arr[1] - arr[0], arr[2] - arr[1]) - 1
    println(answer)
}
