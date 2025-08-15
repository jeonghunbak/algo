fun main(){
    val (a, b) = readln().split(" ").map { it.toDouble() }

    if(a - (a * (b / 100)) >= 100.0) print(0)
    else print(1)
}
