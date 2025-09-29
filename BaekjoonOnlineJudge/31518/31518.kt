fun main(){
    var answer = ""
    readln()
    repeat(3){
        val input = readln().split(" ")
        
        if(input.contains("7")) answer += "7"
    }
    
    print(if(answer == "777") answer else "0")
}
