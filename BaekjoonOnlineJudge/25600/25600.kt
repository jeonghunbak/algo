fun main(){
    val cnt = readln().toInt()
    var answer = -1
    
    repeat(cnt) {
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        val isDouble = if (a == (b + c)) 2 else 1
        val point = (a * (b + c)) * isDouble
        
        if(answer < point) answer = point
    }
    print(answer)
}
