fun main(){
    readln()
    val input = readln()
    var odd = 0
    var even = 0
    
    for(ch in input){
        val target = ch.digitToInt()
        if(target % 2 == 0) even++
        else odd++
    }
    
    if(odd > even) print(1)
    else if(odd < even) print(0)
    else print(-1)
}
