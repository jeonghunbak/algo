fun main() {
    var answer = 0
    while(true){
        val input = readln().toInt()

        if(input == -1) break

        answer += input
    }
    print(answer)
}
