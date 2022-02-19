fun main() {
    val nbaTeams = arrayOf("Lakers","Warriors","Clippers","Bucks")
//    printing the amount of elements inside the array
    println(nbaTeams.size)
//    printing the first element
    println()
    println(nbaTeams[0])
//    printing the first element again
    println()
    println(nbaTeams.get(0))
//    using a for loop
    println()
    for (item in nbaTeams){
        println(item)
    }
//    using a foreach for iterating the array
    println()
    nbaTeams.forEach {
        println(it)
    }

//    renaming the it inside the foreach
    println()
    nbaTeams.forEach {item ->
        println(item)
    }

}