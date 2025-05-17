fun main() {
    val arr = List(5) {
        readln().split(" ").sumOf { it.toInt() }
    }

    val (index, sum) = arr.withIndex().maxBy { it.value }

    println("${index + 1} $sum")
}
