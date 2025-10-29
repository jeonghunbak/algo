import java.util.Locale

fun main(){
    val input = readln().toDouble()
    val result = String.format(Locale.US, "%.2f", input / 4)
    print(result)
}
