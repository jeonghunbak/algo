fun main(){
    val cnt = readln().toInt()
    for(i in 0..cnt){
        val (name, year) = readln().split(" ")
        
        if(year == "2026") {
            println(name)
            break
        }
    }
}
