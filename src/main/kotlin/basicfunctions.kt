fun greetings():String{
//    println("this is how you use it ")
    return "Hello there"
}

fun todnumeros():Unit{
     println("adding two numbers")
}


fun main() {
    println(greetings())
    println(todnumeros())
    println("Looking for something")
    println(singleExpression())
}

//single expression function
fun singleExpression():String = "The single expression function"

//println(singleExpression())