fun main() {
    val input = readln().toInt()
    
    if(input % 5 == 0) print(input / 5)
    else print((input / 5) + 1)
}
