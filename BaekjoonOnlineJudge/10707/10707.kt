fun main(){
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()
    
    val costA = a * e
    val costB = if (e <= c) b else b + (e - c) * d

    println(minOf(costA, costB))
}
