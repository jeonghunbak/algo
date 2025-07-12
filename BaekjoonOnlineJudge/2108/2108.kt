import kotlin.math.roundToInt

fun findNum(list: List<Int>): Int {
    val group = list.groupingBy { it }.eachCount()
    val max = group.values.maxOrNull()

    val filterList = group.filterValues { it == max }
        .keys
        .sorted()

    if(filterList.size > 1) {
        return filterList[1]
    }
    else {
        return filterList.first()
    }
}

fun main() {
    val cnt = readln().toInt()
    val arr = mutableListOf<Int>()

    repeat(cnt){
        arr.add(readln().toInt())
    }

    arr.sort()
    
    println(arr.average().roundToInt()) // 산술평균
    println(arr[arr.size / 2]) // 중앙값
    println(findNum(arr)) // 최반값
    println(arr.last() - arr.first()) // 범위
}
