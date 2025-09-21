fun main(){
    val list = readln().split(" ").map { it.toInt() }
    var answer = 0
    
    for(i in list){
        answer += i * 5
    }
    print(answer)
}
