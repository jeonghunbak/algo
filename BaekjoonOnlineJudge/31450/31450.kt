fun main(){
    val (m, k) = readln().split(" ").map { it.toInt() }
    
    if(m % k == 0) print("Yes")
    else print("No")
}
