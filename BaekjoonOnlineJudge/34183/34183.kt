fun main(){
    val (a, b, c, d) = readln().split(" ").map { it.toInt() }
    
    val needs = (a * 3) - b
    if(needs < 1) print(0)
    else {
        print((needs * c) + d)
    }
}
