fun main(){
    val (a, b) = readln().split(" ").map { it.toLong() }
    val x = a * a * (b + a + 1)
    println(x)
}
