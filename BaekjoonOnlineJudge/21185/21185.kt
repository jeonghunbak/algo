fun main(){
    val n = readln().toInt()
    when (n % 4) {
        0 -> println("Even")
        2 -> println("Odd")
        else -> println("Either")
    }
}
