fun main() {
    val input = readln().toInt()
    var cnt = 0

    for(i in 1 until input){
        if(i.toString().contains("50")) {
            cnt++
        }
    }
    print(input + cnt)
}
