fun main() {
    val day = readln().toInt()
    val cars = readln().split(" ").count { it.toInt() == day }

    println(cars)
}
