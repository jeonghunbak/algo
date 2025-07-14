fun main() {
    val input = readln()
    val regex = "^(pi|ka|chu)+$".toRegex()

    if (regex.matches(input)) println("YES")
    else println("NO")
}
