fun main(){
    while(true){
        val input = readLine() ?: break
        val (n, s) = input.split(" ").map { it.toInt() }
        
        println(s / (n + 1))
    }
}
