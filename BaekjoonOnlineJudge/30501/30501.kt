fun main(){
    val cnt = readln().toInt()
    for(i in 0..cnt){
        val str = readln()
        if(str.contains("S")) {
            println(str)
            break
        }
    }
}
