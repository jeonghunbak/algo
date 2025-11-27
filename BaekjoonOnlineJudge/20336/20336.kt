fun main() {
    val n = readln().toInt()

    val tokens = readln().split(" ")
    val d = tokens[0].toInt()
    val dishes = tokens.drop(1)

    println(d)
    dishes.forEach(::println)
}
