fun main(){
    val cnt = readln().toInt()
    var answer: CharArray? = null

    repeat(cnt) {
        val input = readln()

        if(answer == null) {
            answer = input.toCharArray()
        } else {
            for(i in 0 until input.length) {
                if(answer!![i] != input[i]) answer!![i] = '?'
            }
        }
    }
    print(String(answer!!))
}
