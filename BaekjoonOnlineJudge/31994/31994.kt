data class Seminar(val name: String, val people: Int)

fun main(){
    val list = mutableListOf<Seminar>()
    
     repeat(7){
         val input = readln().split(" ")
         list.add(Seminar(input[0], input[1].toInt()))
     }
    
    val maxSeminar = list.maxByOrNull { it.people }
    println(maxSeminar?.name)
}
