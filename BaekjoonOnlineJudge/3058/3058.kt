fun main() {
    val cnt = readln().toInt()

    repeat(cnt){
        val temp = readln()
            .split(" ")
            .map { it.toInt() }
            .filter { it % 2 == 0 }

        println("${temp.sum()} ${temp.min()}")
    }
}
