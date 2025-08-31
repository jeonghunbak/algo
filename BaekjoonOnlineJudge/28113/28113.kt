fun main(){
    val (time, bus, subway) = readln().split(" ").map { it.toInt() }

    if(bus > subway) {
        print("Subway")
    } else if(bus < subway) {
        print("Bus")
    } else {
        print("Anything")
    }
}
