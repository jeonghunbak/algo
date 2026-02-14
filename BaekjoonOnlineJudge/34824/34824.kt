fun main(){
    val cnt = readln().toInt()
    var y = 0
    var k = 0
    repeat(cnt) { index ->
        val str = readln()
        if (str == "yonsei") y = index
        else if (str == "korea") k = index
    }
    
    if (y < k) println("Yonsei Won!")
    else println("Yonsei Lost...")
}
