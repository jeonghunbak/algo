fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val arr = ArrayDeque<Int>((1..n).toList())
    val result = mutableListOf<Int>()

    while (arr.isNotEmpty()) {
        for (i in 0 until k - 1) {
            val person = arr.removeFirst()
            arr.addLast(person)
        }
        result.add(arr.removeFirst())
    }

    print("<")
    print(result.joinToString(", "))
    println(">")
}
