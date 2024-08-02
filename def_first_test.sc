// def name(param1: type, param2: type): return type = body

def sum(x: Int, y: Int): Int = x + y

extension (s: String)
    def add(n: String): String =
        s + " " + n

@main def def_first_test() =
    // functions
    println(sum(4,5))

    // extension
    val name = "carlos"
    val surname = "orosco"

    val full_name = name.add(surname)
    println(full_name)

    // first class example 1
    val a = List(1, 2, 3).map(i => i * 2)   // List(2,4,6)
    val b = List(1, 2, 3).map(_ * 2)        // List(2,4,6)

    // first class example 2
    def double(i: Int): Int = i * 2

    val a = List(1, 2, 3).map(i => double(i))   // List(2,4,6)
    val b = List(1, 2, 3).map(double)           // List(2,4,6)

    val nums = (1 to 10).toList   // List(1,2,3,4,5,6,7,8,9,10)

    // chaining mathods
    val nums = (1 to 10).toList
    val x = nums.filter(_ > 3)
                .filter(_ < 7)
                .map(_ * 10)