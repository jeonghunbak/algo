fun main(){
    val items = mapOf(
        "Paper" to 57.99,
        "Printer" to 120.50,
        "Planners" to 31.25,
        "Binders" to 22.50,
        "Calendar" to 10.95,
        "Notebooks" to 11.20,
        "Ink" to 66.95
    )
    
    var answer = 0.0
    
    while(true){
        val input = readln()
        
        if(input == "EOI") break
        
        answer += items[input] ?: 0.0
    }
    println("$${String.format("%.2f", answer)}")
}
