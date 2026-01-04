fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    var p = 10 + 2 * (25 - a + b)
    if(p < 1) p = 0
    
    print(p)
}
