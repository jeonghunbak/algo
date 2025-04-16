fun solution(n: Int, numlist: IntArray): IntArray {
    val answer = ArrayList<Int>()

    numlist.forEach {
        if(it % n == 0) answer.add(it)
    }

    return answer.toIntArray()
}
