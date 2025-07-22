import java.math.BigInteger

fun printAnswer(num: BigInteger) {
    when (num.signum()) {
        0 -> println('0')
        1 -> println('+')
        -1 -> println('-')
    }
}

fun main(){
    repeat(3){
        val cnt = readln().toInt()
        var sum = BigInteger.ZERO
        repeat(cnt){
            val input = readln()
            sum += BigInteger(input)
        }
        printAnswer(sum)
    }
}
