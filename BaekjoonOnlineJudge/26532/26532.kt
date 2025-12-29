fun main(){
    val (a, b) = readln().split(" ").map { it.toLong() }
    val area = a * b
    val perBag = 4840L * 5
    
    print((area + perBag - 1) / perBag)
}
