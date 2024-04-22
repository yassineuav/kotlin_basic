
fun sayHello(greeting: String, itemsToGreet:List<String>){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")}
}

fun main() {
    // val interestingThings = listOf("Kotlin", "Programming", "Comic Books", "android apps")
    // interestingThings.forEach{ interestingThing -> println(interestingThing) }
    // interestingThings.forEachIndexed { index, interestingThing -> println("$index: $interestingThing") }
    // val map = mapOf(1 to "Kotlin", 2 to "Programming",3 to "Comic Books",4 to "android apps")
    // map.forEach { (key, value) -> println("$key -> $value") }

    val names = listOf("Yassine", "Siham", "Lovely Siham")

    sayHello(greeting="Hello", itemsToGreet=names)


}