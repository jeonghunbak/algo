fun main(){
    val flight = readln().toInt()
    val highSpeedRail = readln().toInt()
    
    if(flight <= highSpeedRail) print("high speed rail")
    else print("flight")
}
