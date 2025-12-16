fun main(){
    val arr = Array(5) {
        readln().padEnd(15, ' ').toCharArray()
    }
    
    for(col in arr[0].indices) {
        for(row in arr.indices) {
            if(arr[row][col] != ' ') print(arr[row][col])
        }
    }
}
