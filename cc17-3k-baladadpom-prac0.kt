fun main () {

    val pounds = 123
    val kilograms = pounds * 0.453592
    println("Weight in Pounds (lbs): $pounds ")
    println("Weight in Kilograms (kg): $kilograms")
    println("======================================")

    val miles = 456
    val kilometers = miles * 1.60934
    println("Length in Miles (mi): $miles ")
    println("Length in Kilometers (km): $kilometers")
    println("======================================")

    val fahrenheit = 789
    val celsius = (fahrenheit - 32) * 5 / 9
    println("Termperature in fahrenheit: $fahrenheit")
    println("Temperature in celsius: $celsius")
    println("======================================")

    val ages = listOf(17, 38, 8, 10, 14, 23, 5, 19, 35, 24)
    val average = ages.average()
    for ((index, age) in ages.withIndex()){
        println("Age of student ${index + 1}: $age")
    }
    println("Average age: $average\n")

    println("======================================")
    val character1 = "Rastaman"
    val character2 = "Georgina"
    val character3 = "Diablo"
    val weapon = "Rugby"
    val armor = "Red Plastic"

    val story = """
        Once upon a time in a place not far away near baguio city. There was a brave young boy named $character1 who is known to hate $character3. 
        $character3 Holds $character1's Girlfriend hostage in the outskirts of Magsaysay. 
        Before setting of to his journey $character2 gives $character1 the almighty $weapon and the $armor which will protect him in his journey.
    """.trimIndent()

    print(story)
}