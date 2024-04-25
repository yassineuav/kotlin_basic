class Person(){
    var nickName: String? = null
        set(value: String?) {
            field = if (value == null) {
                "no nickname"
            } else {
                value
            }
        }
        get(){
            return field
        }
}

fun main() {
    val person = Person()
    person.nickName = "Yassine"
    var name = person.nickName 
    println("$name")    

}