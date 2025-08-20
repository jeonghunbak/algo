fun main(){
    val cnt = readln().toInt()

    repeat(cnt) {
        val (n, c) = readln().split(" ").map { it.toInt() }

        println(if(n % c == 0) n / c else (n / c) + 1)
    }
}
