fun main() {
    val cnt = readln().toInt()
    val str = readln().toCharArray()
    var sum = 0L
    var r = 1L

    str.forEach {
        sum = (sum + ((it - 'a' + 1) * r)) % 1234567891
        r = (r * 31) % 1234567891
    }
    println(sum % 1234567891)
}
