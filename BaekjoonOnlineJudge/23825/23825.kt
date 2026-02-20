fun main(){
    val (n, m) = readln().split(" ").map { it.toInt() }
    val answer = minOf(n, m) / 2
    println(answer)
}
