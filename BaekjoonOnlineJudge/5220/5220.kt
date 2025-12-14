fun main(){
    val cnt = readln().toInt()
    
    repeat(cnt) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val ones = Integer.bitCount(a)
        val expected = ones % 2
        
        println(if(expected == b) "Valid" else "Corrupt")
    }
}
