fun main() {
    val month = readln().toInt()
    val day = readln().toInt()

    if (month < 2) {
        println("Before")
    } else if (month > 2) {
        println("After")
    } else {
        if (day < 18) {
            println("Before")
        } else if (day > 18) {
            println("After")
        } else { 
            println("Special")
        }
    }
}
