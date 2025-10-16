fun main(){
    val input = readln()
    var vowelsCnt = 0
    var yCnt = 0
    
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    
    for(ch in input){
        if(ch == 'y') yCnt++
        if(vowels.contains(ch)) vowelsCnt++
    }
    
    print("$vowelsCnt ${vowelsCnt + yCnt}")
}
