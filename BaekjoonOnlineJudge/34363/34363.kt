fun main(){
    val s = readln().toDouble()
    val d = readln().toDouble()
    val t = readln().toDouble()
    println(if (s * 5280 / 3600 * t >= d) "MADE IT" else "FAILED TEST")
}
