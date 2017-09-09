class TwoCards (val card0: Card, val card1: Card) {

    fun hand(): TwoCardsHand {
        if(card0 hasSameRank card1) { return TwoCardsHand.PAIR }
        else if(card0 hasSameSuit card1) { return TwoCardsHand.FLUSH }
        else { return TwoCardsHand.HIGH_CARD }
    }

}