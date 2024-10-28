val a = List(16, 25, 40)

def averageA(ages: List[Int]): Int = 
    ages.sum / ages.size
end averageA

averageA(a)

def containsL[A](list: List[A])(item: A): Boolean =
    list match
        case head :: next => 
            (head == item) || containsL(next)(item)
        case Nil => false

containsL(a)(25)

def containsT[A](list: List[A])(item: A): Boolean =
    @annotation.tailrec
    def loop(remaining: List[A]): Boolean =
        remaining match
            case head :: next =>
                (head == item) || loop(remaining = next)
            case Nil => false
    
    loop(list)

containsT(a)(16)

val names = List("aaaa", "eeee", "pppp", "aaee", "aapp")

def existL[A](list: List[A])(predicate: A => Boolean): Boolean =
    list match
        case head :: next => 
            predicate(head) || containsL(next)(predicate)
        case Nil => false

def forAllT[A](list: List[A])(predicate: A => Boolean): Boolean =
    @annotation.tailrec
    def loop(remaining: List[A]): Boolean =
        remaining match
            case head :: next =>
                predicate(head) && loop(next)
            case Nil => true
    loop(list)

existL(names)(a => a.startsWith("a"))
!forAllT(names)(a => !a.startsWith("a"))

forAllT(names)(a => a.length() == 4)
!existL(names)(a => !(a.length() == 4))


def findT[A](list: List[A])(predicate: A => Boolean): Option[A] =
    @annotation.tailrec
    def loop(remaining: List[A]): Option[A] =
        remaining match
            case head :: next =>
                if predicate(head) then Some(head) else loop(next)
            case Nil => None
    loop(list)

findT(names)(a => a == "aaaa")
findT(names)(a => a == "aa")

def filterRec[A](list: List[A])(predicate: A => Boolean): List[A] =
    list match
        case head :: next =>
            val filter_next = filterRec(next)(predicate)
            if predicate(head) then head :: filter_next else filter_next
        case Nil => Nil 

filterRec(names)(a => a.startsWith("a"))

def filterTa[A](data: List[A])(predicate: A => Boolean): List[A] =
    @annotation.tailrec
    def loop(remaining: List[A], acc: List[A]): List[A] =
        remaining match
            case head :: next =>
                loop(
                    next,
                    if predicate(head) then head :: acc else acc
                )
            case Nil => acc.reverse
        
    loop(data, List.empty)