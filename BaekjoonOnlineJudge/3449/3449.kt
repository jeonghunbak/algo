fun main(){
    val cnt = readln().toInt()

    repeat(cnt) {
        var answer = 0
        val a = readln()
        val b = readln()

        for(i in a.indices){
            if(a[i] != b[i]){
                answer++
            }
        }
        println("Hamming distance is $answer.")
    }
}
