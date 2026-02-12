fun main(){
    val cnt = readln().toInt()
    var answer = 0
    repeat(cnt){
        val str = readln()
        if(str.contains("01") || str.contains("OI")) answer++
    }
    print(answer)
}
