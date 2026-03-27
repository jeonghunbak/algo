fun main(){
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    val m = a * b
    val p = c * d
    
    print(
        when {
            m > p -> "M"
            m < p -> "P"
            else -> "E"
        }
    )
}
