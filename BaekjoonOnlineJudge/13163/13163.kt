fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val input = readln().split(" ").toMutableList()
        input[0] = "god"
        println(input.joinToString(""))
    }
}
