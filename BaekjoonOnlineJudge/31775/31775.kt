fun main(){
    var lCnt = 0
    var kCnt = 0
    var pCnt = 0
    
    repeat(3){
        val ch = readln().first()
        
        when {
            ch == 'l' -> lCnt++
            ch == 'k' -> kCnt++
            ch == 'p' -> pCnt++
        }
    }
    
    if(lCnt == 1 && kCnt == 1 && pCnt == 1) print("GLOBAL")
    else print("PONIX")
}
