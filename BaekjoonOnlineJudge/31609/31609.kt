fun main(){
    readln()
    val arr = BooleanArray(10)
    
    readln().split(" ").forEach {
        arr[it.toInt()] = true
    }
    
    arr.forEachIndexed { index, exists ->
        if (exists) println(index)
    }
}
