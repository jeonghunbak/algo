fun main() {
    val cnt = readln().toInt()
    val size = readln().split(" ").map { it.toInt() }
    val bundle = readln().split(" ").map { it.toInt() }
    var answer = 0

    size.forEachIndexed { index, item ->
        answer += item / bundle[0]
        if(item % bundle[0] != 0) answer++
    }

    println(answer)
    println("${cnt / bundle[1]} ${cnt % bundle[1]}")
}
