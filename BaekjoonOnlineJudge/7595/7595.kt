fun main(){
    while(true){
        val cnt = readln().toInt()
        
        if(cnt == 0) break
        
        for(i in 0 until cnt){
            for(j in 0 until i + 1){
                print("*")
            }
            println()
        }
    }
}
