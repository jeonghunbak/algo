fun main(){
    var answer = 0
    val scoreMap = mapOf(
        'K' to 0, 'k' to 0,
        'P' to 1, 'p' to -1,
        'N' to 3, 'n' to -3,
        'B' to 3, 'b' to -3,
        'R' to 5, 'r' to -5,
        'Q' to 9, 'q' to -9,
        '.' to 0
    )
    
    repeat(8){
        val input = readln()
        
        for(ch in input) {
            answer += scoreMap[ch] ?: 0
        }
    }
    print(answer)
}
