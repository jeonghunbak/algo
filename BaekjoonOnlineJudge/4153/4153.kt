fun main() {
    do {
        val input = readln().split(" ").map { it.toInt() }.sortedDescending()
        if(input.sum() == 0) break

        val a = input[0] * input[0]
        val b = input[1] * input[1]
        val c = input[2] * input[2]

        println(if (a == b + c) "right" else "wrong")
    } while (true)
}
