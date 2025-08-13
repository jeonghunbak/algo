fun main(){
    val classRoom =  mapOf(
        "Algorithm" to "204",
        "DataAnalysis" to "207",
        "ArtificialIntelligence" to "302",
        "CyberSecurity" to "B101",
        "Network" to "303",
        "Startup" to "501",
        "TestStrategy" to "105"
    )

    val cnt = readln().toInt()

    repeat(cnt){
        val input = readln()
        println(classRoom.getValue(input))
    }
}
