fun main(){
    val cnt = readln().toInt()
    val groups = mapOf<Int, Int>(
        1 to 1,
        2 to 3,
        3 to 5
    )
    
    repeat(cnt){
        val datas = readln().split(" ").map { it.toInt() }
        val km = groups.getValue(datas[0])
        val candy = datas[1]
        val need = datas[2]
        
        if (candy >= need) {
            println(0)
        } else {
            println((need - candy) * km)
        }
    }
}
