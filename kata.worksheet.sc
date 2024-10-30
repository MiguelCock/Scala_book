// ====================== duck duck goose ======================
class Player(val name: String)

val players = IndexedSeq("a", "b", "c", "d", "c", "e", "f", "g", "h", "z").map(Player(_))

def duckDuckGoose(players: Seq[Player], goose: Int): String = 
    players((goose - 1) % players.length).name


duckDuckGoose(players, 1)
duckDuckGoose(players, 3)
duckDuckGoose(players, 10)
duckDuckGoose(players, 20)
duckDuckGoose(players, 30)
duckDuckGoose(players, 18)
duckDuckGoose(players, 28)
duckDuckGoose(players, 12)
duckDuckGoose(players, 2)
duckDuckGoose(players, 7)

// ====================== Multiply the number ======================
def multiply(n: Long): Long = n * math.pow(5.toDouble, math.log10(n.abs.toDouble).floor + 1).toLong

multiply(10L)
multiply(5L)
multiply(200L)
multiply(0L)
multiply(-2L)

// ====================== Vowel Count ======================
def getCount(inputStr: String): Int = 
    inputStr.count(Set('a', 'e', 'i', 'o', 'u').contains(_))

getCount("")
getCount("a")
getCount("aa")
getCount("aeiou")

// ====================== Parse a linked list from a string ======================
class Node(val data: Int, val next: Node = null)

def parse(nodes: String): Node =
    def loop(remaining: List[String]): Node =
        remaining match
            case  "null" :: next => null
            case head :: next => Node(head.toInt, loop(next))
    loop(nodes.split(" -> ").toList)

parse("1 -> 2 -> 3 -> null")
parse("0 -> 1 -> 4 -> 9 -> 16 -> null")