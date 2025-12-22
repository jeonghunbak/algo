fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val (w, k) = readln().split(" ").map { it.toInt() }
        println((w * k) / 2)
    }
}
