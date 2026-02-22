fun main(){
    val lyrics = hashSetOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )
    
    val cnt = readln().toInt()
    var contains = true
    for(i in 1..cnt){
        val str = readln()
        if(!lyrics.contains(str)){
            contains = false
            break
        }
    }
    print(if(contains) "No" else "Yes")
}
