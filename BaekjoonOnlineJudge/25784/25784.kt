fun main(){
    val (a, b, c) = readln().split(" ").map { it.toInt() }.sorted()
    print(
        when {
            a + b == c -> 1
            a * b == c -> 2
            else -> 3
        }
    )
}
