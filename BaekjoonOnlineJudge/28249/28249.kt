fun main(){
    val pepperMap = mapOf(
        "Poblano" to 1500,
        "Mirasol" to 6000,
        "Serrano" to 15500,
        "Cayenne" to 40000,
        "Thai" to 75000,
        "Habanero" to 125000
    )
    
    val cnt = readln().toInt()
    var answer = 0
    repeat(cnt){
        val input = readln()
        answer += pepperMap[input] ?: 0
    }
    print(answer)
}
