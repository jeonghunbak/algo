fun main() {
    val cnt = readln().toInt()
    val cut = Math.round(cnt * 0.15).toInt()
    var sum = 0
    val arr = mutableListOf<Int>()

    repeat(cnt){
        arr.add(readln().toInt())
    }
    arr.sort()

    for (i in cut..cnt - 1 - cut) {
        sum += arr[i]
    }

    println(Math.round(sum.toDouble() / (cnt - (cut * 2))).toInt())
}
