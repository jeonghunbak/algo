fun main() {
    val input = readln().toInt()
    var answer = 0

    for(i in 1 until input){
        var sum = i
        var temp = i

        while(temp > 0){
            sum += temp % 10
            temp /= 10
        }

        if(sum == input){
            answer = i
            break
        }
    }
    print(answer)
}
