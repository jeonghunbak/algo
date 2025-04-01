fun main() {
    val length = readln().split(" ").map { it.toInt() }
    val arr = IntArray(length[1] + 1) { 1 }
    arr[0] = 0
    arr[1] = 0

    for(i in 2..Math.sqrt(length[1].toDouble()).toInt()){
        if(arr[i]==1){
            for(i in i * i..length[1] step i){
                arr[i] = 0
            }
        }
    }

    for(i in length[0]..length[1]){
        if(arr[i]==1){
            println(i)
        }
    }
}
