fun main(){
    val mbti = readln()
    val cnt = readln().toInt()
    var answer = 0

    repeat(cnt) {
        val input = readln()
        if(mbti == input) answer++
    }
    println(answer)
}
