fun main() {
    var sum = readln().toInt()

    repeat(9){
        sum -= readln().toInt()
    }

    println("${sum}")
}
