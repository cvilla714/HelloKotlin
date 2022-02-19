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
    println(titulo("World"))
    println(unaLinea(mensaje = "Poder"))
}

//single expression function
fun singleExpression():String = "The single expression function"

//passing parameters to the functions
fun titulo(lineis:String){
    val msg = "Hello " + lineis
    println(msg)
//    using template leterals
    val texto = "Todo es un  $lineis"
    print(texto)
}

//have a one line function using template literal
fun unaLinea(mensaje:String) =  println("Ya tiene el $mensaje")
