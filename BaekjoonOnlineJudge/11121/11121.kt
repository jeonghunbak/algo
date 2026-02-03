fun main(){
    val cnt = readln().toInt()
    repeat(cnt){
        val (a, b) = readln().split(" ")
        if(a == b) println("OK")
        else println("ERROR")
    }
}
