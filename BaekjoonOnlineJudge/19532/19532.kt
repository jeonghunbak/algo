fun main() {
    val nums = readln().split(" ").map { it.toLong() }
    val a = nums[0]
    val b = nums[1]
    val c = nums[2]
    val d = nums[3]
    val e = nums[4]
    val f = nums[5]

    val D = a * e - b * d
    val x = (c * e - b * f) / D
    val y = (a * f - c * d) / D

    println("$x $y")
}
