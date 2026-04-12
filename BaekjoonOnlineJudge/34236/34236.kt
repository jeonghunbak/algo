fun main() {
    val n = readln().toInt()
    val years = readln().split(" ").map { it.toInt() }

    val diff = years[1] - years[0]
    val answer = years.last() + diff

    println(answer)
}
