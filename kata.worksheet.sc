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