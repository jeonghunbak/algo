fun main() {
    var group = 1
    while (true) {
        val cnt = readln().toInt()
        if(cnt == 0) break

        val names = mutableListOf<String>()
        val memos = mutableListOf<List<String>>()
        var nobodyNasty = true

        repeat(cnt){
            val str = readln().split(" ")
            val name = str[0]
            val memo = str.takeLast(str.size - 1)

            names.add(name)
            memos.add(memo)
        }
        if(group != 1) println()
        println("Group $group")

        for(i in 0 until cnt){
            val name = names[i]
            val memoList = memos[i]

            for(j in 0 until memoList.size){
                val target = memoList[j]
                if(target == "N"){
                    val receiverIdx = (i - (j + 1) + cnt) % cnt
                    val receiver = names[receiverIdx]

                    println("$receiver was nasty about $name")
                    nobodyNasty = false
                }
            }
        }

        if (nobodyNasty) {
            println("Nobody was nasty")
        }
        group++
    }
}
