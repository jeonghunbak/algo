fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    var answer = 0

    for(i in 1..m){
        for(j in 1..n){
            if(i + j == 10) answer++
        }
    }

    var way = "ways"
    var be = "are"

    if(answer == 1){
        way = "way"
        be = "is"
    }

    print("There $be $answer $way to get the sum 10.")
}
