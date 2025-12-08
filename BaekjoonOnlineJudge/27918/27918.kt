import kotlin.math.absoluteValue

fun main(){
    val cnt = readln().toInt()
    var x = 0
    var y = 0
    
    for(i in 0 until cnt) {
        val input = readln()
        if(input == "D") x++
        else if(input == "P") y++
        
        if((x - y).absoluteValue == 2) break;
    }
    
    print("$x:$y")
}
