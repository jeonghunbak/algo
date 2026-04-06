fun main() {
    readln()
    val s = readln()
    println(s.map { if (it == 'I') 'i' else 'L' }.joinToString(""))
}
