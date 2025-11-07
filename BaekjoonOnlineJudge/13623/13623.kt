fun main(){
    val input = readln().split(" ").map { it.toInt() }
    val player = listOf('A', 'B', 'C')
    
    val one = input.count { it == 1 }
    val zero = input.count { it == 0 }
    
    if(one == 3 || zero == 3){
        print('*')
    } else {
        val frequencyMap = input.groupingBy { it }.eachCount()
        val minEntry = frequencyMap.minByOrNull { it.value }
        val leastFrequentElement = minEntry?.key
        val minIndex = input.indexOf(leastFrequentElement)
        
        print(player[minIndex])
    }
}
