fun main(args: Array<String>) {
    val cnt = readLine()!!.toInt()
    val inputNumber = readLine() ?: ""
    val arr = inputNumber.split(" ").map { it.toInt() }.toTypedArray()
    val max = arr.max()
    var sum: Double = 0.0;

    for (i in 0 until cnt){
        var temp: Double = arr.get(i).toDouble() / max * 100
        sum += temp
    }

    println(sum / cnt)
}
