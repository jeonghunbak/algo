fun main(){
    val input = readln().first()
    
    print(
        when(input) {
            'F' -> "Foundation"
            'C' -> "Claves"
            'V' -> "Veritas"
            'E' -> "Exploration"
            else -> ""
        }
    )
}
