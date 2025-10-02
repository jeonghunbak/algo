fun main(){
    val (h, m) = readln().split(" ").map { it.toInt() }
    print(((h - 9) * 60) + m)
}
