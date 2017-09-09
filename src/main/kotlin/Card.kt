
class Card(val rank: Rank, val suit: Suit) {

    fun getNotation(): String {
       return rank.getNotaion()+ suit.getNotation()
    }

    infix fun hasSameSuit(another : Card) : Boolean {
        return suit == another.suit
    }

    infix fun hasSameRank(another : Card) : Boolean {
        return rank == another.rank
    }


}