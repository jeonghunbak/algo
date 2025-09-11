fun main(){
    val (n, k) = readln().split(" ").map { it.toInt() }
    val cherry = 1 shl (n - 1)
    
    print(k / cherry)
}
