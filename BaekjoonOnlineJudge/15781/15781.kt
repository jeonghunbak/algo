fun main(){
    readln()
    val a = readln().split(" ").mapNotNull { it.toIntOrNull() }.maxOrNull() ?: 0
    val b = readln().split(" ").mapNotNull { it.toIntOrNull() }.maxOrNull() ?: 0

    print(a + b)
}
