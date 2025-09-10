fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){ index ->
        val firstName = readln()
        val lastName = readln()
                
        println("Case ${index + 1}: $lastName, $firstName");
    }
}
