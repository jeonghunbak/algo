fun gcd(a: Int, b: Int): Int {
    if(b == 0){
        return a
    }
    return gcd(b, a % b)
}

fun lcm(a: Int, b: Int, gcdValue: Int): Int {
    return (a * b) / gcdValue
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    input.sortDescending()
    val gcdValue = gcd(input[0], input[1])
    val lcmValue = lcm(input[0], input[1], gcdValue)
    println(gcdValue)
    println(lcmValue)
}
