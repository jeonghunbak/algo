fun main(){
    val (n, x) = readln().split(" ").map { it.toInt() }
    var answer = -1
    repeat(n){
        val (s, t) = readln().split(" ").map { it.toInt() }
        var sum = s + t
        if (sum <= x && s > answer) answer = s
    }
    print(answer)
}
