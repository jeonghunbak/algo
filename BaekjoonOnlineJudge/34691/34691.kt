fun main(){
    while(true){
        val input = readln()
        if(input == "end") break
        
        println(
            when(input){
                "animal" -> "Panthera tigris"
                "flower" -> "Forsythia koreana"
                "tree" -> "Pinus densiflora"
                else -> ""
            }
        )
    }
}
