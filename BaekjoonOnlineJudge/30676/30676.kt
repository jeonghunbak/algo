fun main(){
    when (readln().toInt()) {
        in 620..780 -> print("Red")
        in 590..619 -> print("Orange") // 620 미만
        in 570..589 -> print("Yellow") // 590 미만
        in 495..569 -> print("Green")  // 570 미만
        in 450..494 -> print("Blue")   // 495 미만
        in 425..449 -> print("Indigo") // 450 미만
        in 380..424 -> print("Violet") // 425 미만
        else -> "Undefined" 
    }
}
