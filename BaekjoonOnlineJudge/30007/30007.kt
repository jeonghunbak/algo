fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val (a, b, x) = readln().split(" ").map { it.toInt() }
        
        println(a * (x - 1) + b)
    }
}
