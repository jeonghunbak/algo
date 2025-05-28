fun main() {
    val (len, cnt) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(len)

    repeat(cnt) {
        val (idx, space) = readln().split(" ").map { it.toInt() }

        for(i in idx - 1 until arr.size step space){
            arr[i] = 1
        }
    }
    print(arr.count { it == 0 })
}
