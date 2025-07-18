fun main(){
    val (a, b) = readln().split(" ").map { it.toInt() }
    var max = -1

    for(i in 1..b){
        val temp = (a * i).toString().reversed().toInt()
        if(max < temp) max = temp
    }
    println(max)
}
