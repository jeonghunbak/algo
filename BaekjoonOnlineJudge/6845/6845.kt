fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt){
        val (y, m, d) = readln().split(" ").map { it.toInt() }
        
        val isEligible = when {
            y < 1989 -> true
            y == 1989 -> {
                when {
                    m < 2 -> true
                    m == 2 && d <= 27 -> true
                    else -> false
                }
            }
            else -> false
        }
        
        if(isEligible) println("Yes")
        else println("No")
    }
}
