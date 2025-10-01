fun main(){
    val cnt = readln().toInt()
    var answer = 0
    repeat(cnt){
        if(readln().toInt() % 2 != 0) answer++
    }
    print(answer)
}
