fun main() {
    val (coin, price) = readln().split(" ").map { it.toInt() }
    if(coin * 100 >= price) {
        print("Yes")
    } else {
        print("No")
    }
}
