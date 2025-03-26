fun main(args: Array<String>) {
    val input = readln().split(" ").map { it.toInt() }
    val s = input.get(0)
    val t = input.get(1)
    val d = input.get(2)

    print(d / (s * 2) * t)
}
