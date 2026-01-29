fun main(){
    readln()
    val sum = readln().split(" ").sumOf { it.toInt() }
    
    println(
        when {
            sum < 0 -> "Left"
            sum == 0 -> "Stay"
            else -> "Right"
        }
    )
}
