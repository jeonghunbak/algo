fun main(){
    val price = readln().split(" ").map { it.toInt() }
    val amount = readln().split(" ").map { it.toInt() }
    val unit = listOf(100, 50, 20)
    val answer = (0..2).sumOf { (amount[it] / unit[it]) * price[it] }
    print(answer)
}
