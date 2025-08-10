fun main() {
    val cnt = readln().toInt()

    repeat(cnt) {
        val input = readln()
        val strCnt = input.length

        if(strCnt >= 6 && strCnt <= 9) {
            println("yes")
        }else{
            println("no")
        }
    }
}
