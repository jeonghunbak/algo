fun main() {
    val sb = StringBuilder()

    while(true){
        val (a, b) = readln().split(" ").map { it.toInt() }

        if(a + b == 0) break

        if(a + b == 13) sb.appendLine("Never speak again.")
        else if(a > b) sb.appendLine("To the convention.")
        else if(a < b) sb.appendLine("Left beehind.")
        else if(a == b) sb.appendLine("Undecided.")
    }

    print(sb.toString())
}
