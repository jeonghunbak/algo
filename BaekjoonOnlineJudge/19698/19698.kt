fun main() {
    val (n, w, h, l) = readln().split(" ").map { it.toInt() }

    val maxBySpace = (w / l) * (h / l)
    val result = minOf(n, maxBySpace)

    println(result)
}
