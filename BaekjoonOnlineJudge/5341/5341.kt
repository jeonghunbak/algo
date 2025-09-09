fun main(){
    while(true){
        val input = readln().toInt()
        
        if(input == 0) break
        
        var answer = 0
        repeat(input){ index ->
            answer += (input - index)
        }
        print(answer)
    }
}
