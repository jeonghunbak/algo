fun main() {
    val a = readln().split(" ").map { it.toInt() }.sum()
    val b = readln().split(" ").map { it.toInt() }.sum()

    if(a >= b) println(a)
    else println(b)
}
