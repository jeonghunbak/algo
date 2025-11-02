fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val input = readln().toInt()
        
        if(input % 25 < 17) println("ONLINE")
        else println("OFFLINE")
    }
}
