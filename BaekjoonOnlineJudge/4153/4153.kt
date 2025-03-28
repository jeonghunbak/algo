fun main() {
    while(true){
        val input = readln().split(" ").map { it.toInt() }.toMutableList()
        if(input.sum() == 0) break

        input.sort()

        val a = input[0] * input[0]
        val b = input[1] * input[1]
        val c = input[2] * input[2]

        println(if (a + b == c) "right" else "wrong")
    }
}
