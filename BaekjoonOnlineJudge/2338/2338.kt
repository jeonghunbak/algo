import java.math.BigInteger

fun main(args: Array<String>) {
    val a = BigInteger(readLine()!!.toString())
    var b = BigInteger(readLine()!!.toString())

    println(a.add(b))
    println(a.minus(b))
    println(a.multiply(b))
}
