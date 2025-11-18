fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val (x, y) = readln().split(" ").map { it.toInt() }
    
        if(x >= y) println("MMM BRAINS")
        else println("NO BRAINS")
    }
}
