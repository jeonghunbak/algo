fun main() {
    val format = "%-15s%-15s%-11s%-10s\n"

    print(format.format("SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE"))
    print(format.format("N2 Bomber", "Heavy Fighter", "Limited", "21"))
    print(format.format("J-Type 327", "Light Combat", "Unlimited", "1"))
    print(format.format("NX Cruiser", "Medium Fighter", "Limited", "18"))
    print(format.format("N1 Starfighter", "Medium Fighter", "Unlimited", "25"))
    print(format.format("Royal Cruiser", "Light Combat", "Limited", "4"))
}
