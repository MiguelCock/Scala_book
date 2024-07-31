import scala.io.StdIn.readLine

@main def match_test() =
    println("Enter a number:")
    val name = readLine()

    name match
        case "1" => println("is one")
        case "2" => println("is two")
        case _ => println("is neither 1 nor 2")