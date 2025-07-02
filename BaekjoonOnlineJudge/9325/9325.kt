fun main() {
    val cnt = readln().toInt()

    repeat(cnt){
        var car = readln().toInt()
        val options = readln().toInt()

        repeat(options){
            val (optionCnt, optionPrice) = readln().split(" ").map { it.toInt() }
            car += (optionCnt * optionPrice)
        }
        println(car)
    }
}
