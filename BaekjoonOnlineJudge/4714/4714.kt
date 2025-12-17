fun main(){
    while(true) {
        val input = readln().toDouble()
        if(input == -1.0) break
        
        val moon = input * 0.167
        
        println("Objects weighing %.2f on Earth will weigh %.2f on the moon.".format(input, moon))
    }
}
