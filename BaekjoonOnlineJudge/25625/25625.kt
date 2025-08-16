fun main(){
    val (x, y) = readln().split(" ").map { it.toInt() }

    if(x > y) {
        print(x + y)
    } else {
        print(y - x)
    }
}
