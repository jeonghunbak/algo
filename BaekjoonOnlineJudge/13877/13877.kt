fun parse(num: String, radix: Int): Int {
    return try {
        num.toInt(radix)
    } catch (e: NumberFormatException) {
        0
    }
}

fun main(){
    val cnt = readln().toInt()
    repeat(cnt){
        val (idx, num) = readln().split(" ")
        val oct = parse(num, 8)
        val dec = parse(num, 10)
        val hex = parse(num, 16)
        
        println("$idx $oct $dec $hex")
    }
}
