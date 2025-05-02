fun main(){
    var seconds = 0

    repeat(4){
        seconds += readln().toInt()
    }

    println(seconds / 60)
    println(seconds % 60)
}
