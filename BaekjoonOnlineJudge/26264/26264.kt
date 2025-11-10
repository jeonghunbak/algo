fun main(){
    readln()
    val input = readln()
    val s = "security"
    val b = "bigdata"
    
    val sCnt = input.windowed(s.length).count { it == s }
    val bCnt = input.windowed(b.length).count { it == b }
    
    when {
        sCnt > bCnt -> print("security!")
        sCnt < bCnt -> print("bigdata?")
        else -> print("bigdata? security!")
    }
}
