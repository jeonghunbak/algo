fun main(){
    val input = readln()
    val need = setOf('M', 'O', 'B', 'I', 'S')
    
    if (input.toSet().containsAll(need)) {
        println("YES")
    } else {
        println("NO")
    }
}
