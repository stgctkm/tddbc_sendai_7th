enum class Suit (val symbol : String) {
    SPADE("♠"), HEART("♥"), CLUB("♣"), DIAMOND("♦︎");

    fun getNotation() = symbol
}