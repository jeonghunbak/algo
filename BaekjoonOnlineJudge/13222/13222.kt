fun main(){
    val (n, w, h) = readln().split(" ").map { it.toInt() }
    val maxLen = (w * w) + (h * h)
    
    repeat(n) {
        val len = readln().toInt()
        if (len * len <= maxLen) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
