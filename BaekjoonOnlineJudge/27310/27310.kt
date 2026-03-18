fun main(){
    val str = readln()
    var answer = 0
    answer += str.length
    answer += str.count { it == ':' }
    answer += str.count { it == '_' } * 5
    print(answer)
}
