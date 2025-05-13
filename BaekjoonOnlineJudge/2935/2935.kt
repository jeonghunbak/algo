fun main() {
    val a = readln().toBigInteger()
    val b = readln()
    val c = readln().toBigInteger()

    if(b == "+") print(a.plus(c))
    else print(a.multiply(c))
}
