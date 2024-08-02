enum Size:
  case Small, Medium, Large

enum Type:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import Size.*
import Type.*
import Topping.*

class Pizza(val size: Size, val tipe: Type, val top: Topping):
    
    def eat(): String =
        tipe match
            case Thin => "thin"
            case Thick => "thick"
            case Regular => "regular"

@main def enum_test() =
    val currentCrustSize = Small

    currentCrustSize match
        case Small => println("Small crust size")
        case Medium => println("Medium crust size")
        case Large => println("Large crust size")

    if currentCrustSize == Small then println("Small crust size")

    val cheeeessepizza = Pizza(Large, Thick, Cheese)
    println(cheeeessepizza.eat())