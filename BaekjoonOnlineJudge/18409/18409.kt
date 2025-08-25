fun main(){
    val vowels = listOf<Char>('a', 'o', 'i', 'e', 'u')
    var answer = 0
    
    readln()
    val input = readln()

    for(ch in input) {
        if(vowels.contains(ch)) answer++
    }
    print(answer)
}
