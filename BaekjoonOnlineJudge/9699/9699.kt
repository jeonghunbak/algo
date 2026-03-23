fun main(){
    val n = readln().toInt()
    repeat(n) { index ->
        val num = index + 1
        val max = readln().split(" ").maxOf { it.toInt() }
        println("Case #${num}: ${max}")
    }
}
