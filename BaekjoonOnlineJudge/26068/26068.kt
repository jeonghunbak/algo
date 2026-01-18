fun main(){
    val cnt = readln().toInt()
    var answer = 0
    repeat(cnt) {
        val input = readln().replace("D-", "").toInt()
        if(input <= 90) answer++
    }
    print(answer)
}
