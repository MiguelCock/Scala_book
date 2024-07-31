import scala.io.StdIn.readLine

@main def match_test() =
    println("Enter a number:")
    val name = readLine()

    name match
        case "1" => println("is one")
        case "2" => println("is two")
        case _ => println("is neither 1 nor 2")

    println(getClassAsString(1))
    println(getClassAsString("hello"))
    println(getClassAsString(List(1, 2, 3)))


def getClassAsString(x: Matchable): String = x match
    case s: String => s"'$s' is a String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[?] => "List"
    case _ => "Unknown"