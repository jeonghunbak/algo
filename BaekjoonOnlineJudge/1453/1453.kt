fun main() {
    val cnt = readln().toInt()
    val customer = readln().split(" ").map { it.toInt() }
    var answer = 0
    val seat = BooleanArray(101) { false }

    customer.forEach { it ->
        if(seat[it] == false) seat[it] = true
        else answer++
    }
    print(answer)
}
