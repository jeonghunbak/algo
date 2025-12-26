fun main(){
    val cnt = readln().toInt()
    val list = mutableListOf<Int>()
    
    repeat(cnt){
        list.add(readln().toInt())
    }
    
    val min = list.minOrNull()!!
    val max = list.maxOrNull()!!
    
    when{
        list[0] == min -> print("ez")
        list[0] == max -> print("hard")
        else -> print("?")
    }
}
