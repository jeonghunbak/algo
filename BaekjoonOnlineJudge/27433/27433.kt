fun main(){
    val cnt = readln().toInt()
    var answer = 1L
    for (i in 2..cnt) answer *= i
    
    print(answer)
}
