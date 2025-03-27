fun main() {
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    var cnt = 1

    while(input[0] < 5 && input[1] < 5){
        val idx = cnt and 1
        input[idx] = input[0] + input[1]
        cnt++
    }

    println(if (input[0] >= 5) "yj" else "yt")
}
