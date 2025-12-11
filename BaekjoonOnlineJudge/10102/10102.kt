fun main(){
    readln()
    val list = readln().toCharArray()
    val aCnt = list.count { it == 'A'}
    val bCnt = list.count { it == 'B'}
    
    if(aCnt == bCnt) print("Tie")
    else if(aCnt > bCnt) print("A")
    else if(aCnt < bCnt) print("B")
}
