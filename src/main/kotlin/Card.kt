
class Card(val suit: Suit, val rank: Rank) {

    fun getNotation(): String {
       return rank.rank + suit.symbol
    }

    infix fun hasSameSuit(other : Card) : Boolean {
        return suit == other.suit
    }


}