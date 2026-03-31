fun main() {
    val (n, cnt) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = i + 1
    }

    repeat(cnt) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val temp = arr[a - 1]
        arr[a - 1] = arr[b - 1]
        arr[b - 1] = temp
    }
    println(arr.joinToString(" "))
}
