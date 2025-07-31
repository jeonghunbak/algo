fun main() {
    val cnt = readln().toInt()
    var answer = 0
    repeat(cnt){
        val input = readln().split(" ").map { it.toInt() }.reduce { acc, i -> acc * i }
        if(answer < input) answer = input
    }
    print(answer)
}
