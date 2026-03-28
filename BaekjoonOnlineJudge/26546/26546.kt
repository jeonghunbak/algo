fun main(){
    repeat(readln().toInt()) {
        val (str, start, end) = readln().split(" ")
        println(str.substring(0, start.toInt()) + str.substring(end.toInt()))
    }
}
