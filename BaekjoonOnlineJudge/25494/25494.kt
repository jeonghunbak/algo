fun main(){
    val cnt = readln().toInt()
    repeat(cnt){
        val (a, b, c) = readln().split(" ").map { it.toInt() }
        println(minOf(a, b, c))
    }
}
