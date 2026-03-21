fun main(){
    val cnt = readln().toInt()
    repeat(cnt){
        val (a, b) = readln().split(" ")
        println(b.repeat(a.toInt()))
    }
}
