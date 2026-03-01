fun main() {
    val cnt = IntArray(10)
    repeat(5) { cnt[readln().toInt()]++ }
    println(cnt.indexOfFirst { it % 2 == 1 })
}
