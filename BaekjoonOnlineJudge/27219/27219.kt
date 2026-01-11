fun main(){
    val input = readln().toInt()
    val vCnt = input / 5
    val iCnt = input % 5
    
    print("V".repeat(vCnt) + "I".repeat(iCnt))
}
