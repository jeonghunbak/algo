data class Datas(val solved: Int, val penalty: Int)

fun main() {
    val arr = listOf(
        Datas(12, 1600),
        Datas(11, 894),
        Datas(11, 1327),
        Datas(10, 1311),
        Datas(9, 1004),
        Datas(9, 1178),
        Datas(9, 1357),
        Datas(8, 837),
        Datas(7, 1055),
        Datas(6, 556),
        Datas(6, 773),
    )
        
    val idx = readln().toInt() - 1
    
    println("${arr[idx].solved} ${arr[idx].penalty}")
}
