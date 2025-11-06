fun main(){
    val input = readln().split("/").map { it.toInt() }
    val k = input[0]
    val d = input[1]
    val a = input[2]
    
    if(k + a < d || d == 0){
        print("hasu")
    }else{
        print("gosu")
    }
}
