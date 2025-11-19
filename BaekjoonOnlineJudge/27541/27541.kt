fun main(){
    readln()
    var input = readln()
    
    input = if (input.last() == 'g') {
        input.dropLast(1)
    } else {
        input + 'g'
    }
    
    print(input)
}
