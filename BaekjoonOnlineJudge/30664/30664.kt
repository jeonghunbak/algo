import java.math.BigInteger

fun main() {
    val fortyTwo = BigInteger("42")

    while (true) {
        val s = readln().trim()
        if (s == "0") break

        val n = BigInteger(s)
        if (n % fortyTwo == BigInteger.ZERO) {
            println("PREMIADO")
        } else {
            println("TENTE NOVAMENTE")
        }
    }
}
