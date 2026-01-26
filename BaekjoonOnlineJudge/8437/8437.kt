import java.math.BigInteger

fun main() {
    val total = BigInteger(readln().trim())
    val diff = BigInteger(readln().trim())

    val klaudia = (total + diff) / BigInteger("2")
    val natalia = (total - diff) / BigInteger("2")

    println(klaudia)
    println(natalia)
}
