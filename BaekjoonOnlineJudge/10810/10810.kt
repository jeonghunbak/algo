fun main(){
    val (len, cnt) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(len) { 0 }

    repeat(cnt) {
        val (from, to, ball) = readln().split(" ").map { it.toInt() }
        for (i in from - 1..to - 1) {
            arr[i] = ball
        }
    }
    println(arr.joinToString(" "))
}
