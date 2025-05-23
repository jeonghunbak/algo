fun main() {
    val a = readln()
    val b = readln()

    val sbAnd = StringBuilder()
    val sbOr = StringBuilder()
    val sbXor = StringBuilder()
    val sbNotA = StringBuilder()
    val sbNotB = StringBuilder()

    for (i in a.indices) {
        sbAnd.append(if (a[i] == '1' && b[i] == '1') '1' else '0')
        sbOr.append(if (a[i] == '1' || b[i] == '1') '1' else '0')
        sbXor.append(if (a[i] != b[i]) '1' else '0')
        sbNotA.append(if (a[i] == '0') '1' else '0')
        sbNotB.append(if (b[i] == '0') '1' else '0')
    }

    println(sbAnd.toString())
    println(sbOr.toString())
    println(sbXor.toString())
    println(sbNotA.toString())
    println(sbNotB.toString())
}
