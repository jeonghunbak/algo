fun main(){
    val str = readln().take(5)
    val cnt = readln().toInt()
    var answer = 0
    
    repeat(cnt){
        val input = readln().take(5)
        if(input == str) answer++
    }
    print(answer)
}
