fun main() {
    val coupon = readln().toInt()
    var price = readln().toInt()
    val arr = mutableListOf<Int>()

    if(5 <= coupon) arr.add(500)
    if(10 <= coupon) arr.add((price * 0.1).toInt())
    if(15 <= coupon) arr.add(2000)
    if(20 <= coupon) arr.add((price * 0.25).toInt())

    if (!arr.isEmpty()) price -= arr.max()
    
    println(if(price < 0) 0 else price)
}
