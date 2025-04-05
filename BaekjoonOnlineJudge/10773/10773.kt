import java.util.Stack

fun main() {
    val stack = Stack<Int>()
    val cnt = readln().toInt()
    
    repeat(cnt){
        val input = readln().toInt()

        if(input == 0) stack.pop()
        else stack.push(input)
    }
    
   println(stack.sum())
}
