fun addDaysVirtual(dateStr: String, add: Long): String {
    val parts = dateStr.split("-")
    val y = parts[0].toInt()
    val m = parts[1].toInt()
    val d = parts[2].toInt()
    
    var total = (y * 360L) + ((m - 1) * 30L) + (d - 1)
    
    total += add
    
    if (total < 0) total = 0

    val newY = (total / 360).toInt()
    val remain = total % 360
    val newM = (remain / 30).toInt() + 1
    val newD = (remain % 30).toInt() + 1

    // 형식 맞추기
    return "%04d-%02d-%02d".format(newY, newM, newD)
}

fun main() {
    println(addDaysVirtual(readln(), readln().toLong()))
}
