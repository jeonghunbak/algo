fun main(){
    val input = readln().toInt() % 8
    
    println(
        when (input) {
            1 -> 1
            2, 0 -> 2
            3, 7 -> 3
            4, 6 -> 4
            else -> 5
        }
    )
}
