fun main(){
    val str = readln().replace(" ", "")
    val a = str[0].digitToInt()
    val b = str[2].digitToInt()
    val c = str[4].digitToInt()
    
    print(if (a + b == c) "YES" else "NO")
}
