fun main() {
    val money = readln().split(" ").map { it.toInt() }
    println(if(money[0] * money[1] < money[2]) 0 else money[0] * money[1] - money[2])
}
