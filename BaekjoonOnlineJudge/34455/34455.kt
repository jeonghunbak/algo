fun main(){
    var a = readln().toInt()
    val cnt = readln().toInt()
    repeat(cnt){
        val symbol = readln()
        val num = readln().toInt()
        
        if(symbol == "+") a += num
        else if(symbol == "-") a -= num
    }
    print(a)
}
