fun main(){
    val input = readln()
    
    val contain = input.contains('7')
    val divisibleBySeven = input.toInt() % 7 == 0
    
    val result = when {
        !contain && !divisibleBySeven -> 0
        !contain && divisibleBySeven  -> 1
        contain  && !divisibleBySeven -> 2
        else -> 3
    }
    
    print(result)
}
