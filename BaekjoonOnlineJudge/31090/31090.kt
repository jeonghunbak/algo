fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt) {
        val year = readln().toInt()
        val next = year + 1
        val n = year % 100
        
        println(if(next % n == 0) "Good" else "Bye")
    }
}
