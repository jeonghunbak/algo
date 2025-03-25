fun main(args: Array<String>) {
    val cnt = readln().toInt()

    for (i in 1..cnt){
        var sum = readln().split(" ").map { it.toInt() }.sum()
        println("Case #${i}: ${sum}")
    }
}
