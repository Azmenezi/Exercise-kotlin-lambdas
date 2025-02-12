fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5))
    println(calculateDepth(1500,800))
}

val greetSeaCreatures = {
    println("hello, deep sea")
}

val findPearl = { numberOfPearls: Int -> numberOfPearls * numberOfPearls}

val divideTreasure = {  totalTreasuresKWD: Double, numberOfExplorers: Int -> totalTreasuresKWD / numberOfExplorers}

val calculateDepth: (Int, Int) -> Int = { location1,location2 -> location1 - location2 }