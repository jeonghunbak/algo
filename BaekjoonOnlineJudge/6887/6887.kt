import kotlin.math.floor
import kotlin.math.sqrt

fun main(){
    val n = readln().toDouble()
    val side = floor(sqrt(n)).toInt()

    println("The largest square has side length $side.")
}
