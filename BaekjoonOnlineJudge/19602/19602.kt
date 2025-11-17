fun main(){
  var answer = 0
    
  repeat(3){ index ->
      val input = readln().toInt()
      answer += (index + 1) * input
  }
  print(if(answer >= 10) "happy" else "sad")
}
