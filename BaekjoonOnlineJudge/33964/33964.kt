fun main(){
    val (x, y) = readln().split(" ").map { it.toInt() }
    val a = "1".repeat(x).toInt()
    val b = "1".repeat(y).toInt()

    println(a + b)
}
