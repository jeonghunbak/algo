fun main() {
    val price = readln().toInt()
    val cnt = readln().toInt()
    var sum = 0

    repeat(cnt){
        val (a, b) = readln().split(" ").map { it.toInt() }
        sum += (a * b)
    }

    print(if(price == sum) "Yes" else "No")
}
