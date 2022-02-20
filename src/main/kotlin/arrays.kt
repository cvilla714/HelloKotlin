fun main() {
    val nbaTeams = arrayOf("Lakers","Warriors","Clippers","Bucks")
//    printing the amount of elements inside the array
    println(nbaTeams.size)
println()
//    printing the first element
    println(nbaTeams[0])
println()
//    printing the first element again
    println(nbaTeams.get(0))
println()
//    using a for loop
    for (item in nbaTeams){
        println(item)
    }

//    using a foreach for iterating the array
println()
    nbaTeams.forEach {
        println(it)
    }
println()
//    renaming the it inside the foreach
    nbaTeams.forEach {item ->
        println(item)
    }
println()
//    using the class person
    val person = Person("Luffy","Monkey D")
    println(person.lastName)
    println(person.firstName)

}


