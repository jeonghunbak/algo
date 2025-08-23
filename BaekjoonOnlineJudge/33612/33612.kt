fun main(){
    val input = (readln().toInt() - 1) * 7
    var year = 2024
    var month = 8 + input

    year += (month - 1) / 12
    month = (month - 1) % 12 + 1

    println("$year $month")
}
