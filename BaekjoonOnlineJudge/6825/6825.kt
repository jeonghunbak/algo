fun main(){
    val weight = readln().toDouble()
    val height = readln().toDouble()
    val bmi = weight / (height * height)
   
    when {
        bmi < 18.5 -> println("Underweight")
        bmi > 25.0 -> println("Overweight")
        else -> println("Normal weight")
    }
}
