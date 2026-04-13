fun main() {
    val n = readln().toInt()
    var answer = "True"
    repeat(n) {
        val h = readln().toInt()
        if (h < 48) answer = "False"
    }
    println(answer)
}
