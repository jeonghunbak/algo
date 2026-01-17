fun main(){
    val place = readln().toInt()
    val walk = readln().toInt()
    var placePoint = place * 10

    if(place >= 3) placePoint += 20
    if(place == 5) placePoint += 50
    if(walk > 1000) placePoint -= 15

    print(if(placePoint < 1) 0 else placePoint)
}
