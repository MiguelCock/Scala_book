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