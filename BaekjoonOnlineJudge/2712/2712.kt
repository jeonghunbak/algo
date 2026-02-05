fun main(){
    val cnt = readln().toInt()
    repeat(cnt){
        val (num, unit) = readln().split(" ")
        val v = num.toDouble()
        
        when (unit) {
            "kg" -> println("%.4f lb".format(v * 2.2046))
            "lb" -> println("%.4f kg".format(v * 0.4536))
            "l"  -> println("%.4f g".format(v * 0.2642))
            "g"  -> println("%.4f l".format(v * 3.7854))
        }
    }
}
