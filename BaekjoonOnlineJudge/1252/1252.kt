import java.math.BigInteger

fun main(){
    val (a, b) = readln().split(" ")

    val aa = BigInteger(a, 2)
    val bb = BigInteger(b, 2)
    val sum = aa + bb

    println(sum.toString(2))
}
