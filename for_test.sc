import scala.io.StdIn.readLine

@main def for_test() =
    val ints = List(1, 2, 3, 4, 5)

    for i <- ints do println(i)

    for (
        i <- 1 to 3
        j <- 'a' to 'c'
    ) {
        println(s"i = $i, j = $j")   // prints: "i = 2, j = b"
    }

    val doubles = for ( i <- ints ) yield (i * 2)

    val val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for (
        f <- fruits
        if f.length > 4
    ) {
        yield f.length
    }
        
