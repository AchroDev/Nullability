//fun main() {
//    var favoriteActor: String? = "Redzed"
//
//    println(favoriteActor!!.length)
//}


// Using if/else conditionals to perform null checks
//fun main() {
//    var name: String? = "Achro"
//
//    val lengthOfName = if (name != null) {
//        name.length
//    } else {
//        0
//    }
//
//    println("The number of character in your name is $lengthOfName.")
//}

// Using the "?:" Elvis operator with the "?." Safe-call operator similar to an if/else expression
fun main() {
    var name: String? = "Achro"

    val lengthOfName = name?.length ?: 0

    println("The number of character in your name is $lengthOfName.")
}