fun main(){
    val (d, h, m) = readln().split(" ").map { it.toInt() }
    
    if(d < 11 || (d == 11 && h < 11) || (d == 11 && h == 11 && m < 11)) { 
         print(-1)
    } else {
        print( 
            (d - 11) * 1440 +
            (h - 11) * 60 +
            (m - 11)
        )
    }
}
