fun main(){
    val (a, b, c) = readln().split(" ").map { it.toDouble() }
    
    val r1 = a * b / c
    val r2 = a / b * c
    
    println(maxOf(r1, r2).toLong())
}
