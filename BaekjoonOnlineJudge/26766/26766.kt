fun main(){
    val heartShape = """
 @@@   @@@ 
@   @ @   @
@    @    @
@         @
 @       @ 
  @     @  
   @   @   
    @ @    
     @     
    """.trimIndent()
    
    repeat(readln().toInt()){
        println(heartShape)
    }
}
