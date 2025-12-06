fun main(){
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }
    
    val option1 = a[0] + b[1]
    val option2 = a[1] + b[0]
    
    println(minOf(option1, option2))
}
