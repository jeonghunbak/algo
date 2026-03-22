fun main(){
    val n = readln().toInt()
    val cnt = readln()
        .split(" ")
        .count { it.toInt() == n }
    
    print(cnt)
}
