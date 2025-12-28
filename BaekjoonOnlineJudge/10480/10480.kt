fun main(){
    val cnt =readln().toInt()
    
    repeat(cnt) {
        val input = readln().toInt()
        println(
            if(input % 2 == 0) "$input is even" 
            else "$input is odd"
        )
    }
}
