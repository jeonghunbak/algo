import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var answer = 0
    while (readLine() != null) {
        answer++
    }
    println(answer)
}
