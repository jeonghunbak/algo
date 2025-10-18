fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    val (c, d) = readln().split(" ").map { it.toInt() }
    
    if(a + c < b + d) print("Hanyang Univ.")
    else if(a + c > b + d) print("Yongdap")
    else print("Either")
}
