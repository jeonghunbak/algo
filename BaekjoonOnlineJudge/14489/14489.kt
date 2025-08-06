fun main() {
    val balance = readln().split(" ").sumOf { it.toInt() }
    val price = readln().toInt() * 2

    if(balance >= price) {
        print(balance - price)
    } else {
        print(balance)
    }
}
