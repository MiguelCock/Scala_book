import scala.io.StdIn.readLine

@main def test1() =
    println("Please enter your name:")
    val name = readLine()

    println("Hello, " + name + "!")

    val ints = List(1, 2, 3, 4, 5)

    for i <- ints do println(i)



    for {
        i <- 1 to 3
        j <- 'a' to 'c'
    } {
        println(s"i = $i, j = $j")   // prints: "i = 2, j = b"
    }