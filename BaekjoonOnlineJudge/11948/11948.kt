fun main(){
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    
    repeat(6){ index ->
        val input = readln().toInt()
        
        if(index < 4) a.add(input)
        else b.add(input)
    }
    
    val aSum = a.sum() - (a.minOrNull() ?: 0)
    val bSum = b.sum() - (b.minOrNull() ?: 0)

    print(aSum + bSum)
}
