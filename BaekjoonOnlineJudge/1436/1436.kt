fun main() {
    val cnt = readln().toInt()
    var number = 665
    var series = 0

    while (true){
        number += 1
        if(number.toString().contains("666")) series++
      
        if(series == cnt){
            println(number)
            break
        }
    }
}
