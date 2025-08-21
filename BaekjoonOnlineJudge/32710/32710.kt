fun main(){
    val input = readln().toInt()
    var flag = 0

    for(i in 2..9){
        for(j in 1..9){
            if(input == i || input == j || input == i * j) {
                flag = 1
                break
            }
        }
        if(flag == 1) break
    }
    print(flag)
}
