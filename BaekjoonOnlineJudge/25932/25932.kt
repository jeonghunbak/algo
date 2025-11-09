fun main(){
    val cnt = readln().toInt()
    var isZack = false // 17
    var isMack = false // 18
    
    repeat(cnt){
        val input = readln().split(" ").map { it.toInt() }
        
        isZack = 17 in input
        isMack = 18 in input 
        
        val result = when {
            isZack && isMack -> "both"
            isZack -> "zack"
            isMack -> "mack"
            else -> "none"
        }
        
        println(input.joinToString(" "))
        println(result)
        println()
    }
}
