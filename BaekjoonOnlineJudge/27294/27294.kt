fun main(){
    val (time, drink) = readln().split(" ").map { it.toInt() }
    var rice = 280

    if(time >= 12 && time <= 16 && drink != 1) {
        rice = 320
    }
    print(rice)
}
