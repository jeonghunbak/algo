fun main() {
    val coupon = readln().toInt()
    var price = readln().toInt()

    val discounts = buildList {
        if (coupon >= 5) add(500)
        if (coupon >= 10) add((price * 0.1).toInt())
        if (coupon >= 15) add(2000)
        if (coupon >= 20) add((price * 0.25).toInt())
    }

    val maxDiscount = discounts.maxOrNull() ?: 0
    val finalPrice = (price - maxDiscount).coerceAtLeast(0)

    println(finalPrice)
}
