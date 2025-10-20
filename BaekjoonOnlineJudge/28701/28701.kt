import kotlin.math.*

fun main(){
    val n = readln().toInt()
    var a1 = 0
    var a2 = 0.0
    var a3 = 0.0
    
    repeat(n){ index ->
        val num = index + 1
        val dNum = num.toDouble()
              
        a1 += num
        a2 += dNum
        a3 += (dNum).pow(3.0)
    }
    
    println(a1)
    println((a2).pow(2.0).toInt())
    println(a3.toInt())
}
