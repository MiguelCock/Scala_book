// def name(param1: type, param2: type): return type = body

def sum(x: Int, y: Int): Int = x + y

extension (s: String)
    def add(n: String): String =
        s + " " + n

@main def def_first_test() =
    println(sum(4,5))

    val name = "carlos"
    val surname = "orosco"

    val full_name = name.add(surname)
    println(full_name)