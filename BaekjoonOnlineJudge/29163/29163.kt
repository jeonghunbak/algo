fun main(){
    readln()
    val list = readln().split(" ").map { it.toInt() }
    var odd = 0
    var even = 0
    
    for(item in list){
        if(item % 2 == 0) even++
        else odd++
    }
    
    print(if(even > odd) "Happy" else "Sad")
}
