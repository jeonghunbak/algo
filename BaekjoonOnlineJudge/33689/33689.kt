fun main() {
    val cnt = readln().toInt()
    var answer = 0

    repeat(cnt){
        val input = readln()
        if(input[0] == 'C') answer++
    }
    print(answer)
}
