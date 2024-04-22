// variables
val name:String = "Yassine"
var greeting: String? = "hello"
fun main() {
    val printGreeting = if(greeting != null) greeting else "Hi"
    println("$printGreeting $name ")
}