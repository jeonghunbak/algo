fun main(){
    val text = "UOS"
    val input = readln().toInt()

    print(text[(input + 2) % 3])
}
