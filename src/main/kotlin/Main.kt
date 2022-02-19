//fun main(){
//    println("Hello World")
//}

//not been able to re assigned new value using val
//fun main() {
//    val name: String = "Luffy"
//    name = "Zorro"
//    println(name)
//}

//re assigning the value of the variable using var
//
//fun main(){
//    var name:String= "Luffy"
//    name = "Zorro"
//    println(name)
//}

//val name:String = "Luffy"
//
//fun main() {
//    println(name)
//}

//addin a null variable
//val name: String? =null
//var greeting: String = "Jinbei"
//
//fun main() {
//    println(greeting)
//    println(name)
//    greeting = "Moving closely"
//    println(greeting)
//}

//adding control flow with an if statement
//val greeting:String? = null
//fun main() {
//    if (greeting!=null){
//        println(greeting)
//    }else{
//        println("Hi")
//    }
//
//}

//applying when statement
//var greeting:String? = null
//
//fun main() {
//    when (greeting){
//        null -> println("Replacing null value")
//        else -> println(greeting)
//    }
//}

//how to add if statement to add assigned a new variable
var greetings: String? = null

fun main() {
//    val newGreetings = if (greetings !=null) greetings else "Say something else"
    val newGreetingUsingWhen = when(greetings){
        null -> "No more null"
        else -> greetings
    }
//    println(newGreetings)
    println(newGreetingUsingWhen)
}

