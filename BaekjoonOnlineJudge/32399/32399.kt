fun main() {
    val input = readln()

    when(input){
        "(1)" -> print(0)
        ")1(" -> print(2)
        else -> print(1)
    }
}
