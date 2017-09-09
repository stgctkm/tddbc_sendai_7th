import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.*

class CardSpec : Spek({
    describe("ツ-カ-ドポ-カ-の手札") {
        on("ペアの判定") {
            it("「ハートのJ」と「スペ-ドのJ」の役はペア") {
                assertEquals(TwoCards(
                        Card(rank = Rank.JACK, suit = Suit.HEART),
                        Card(rank = Rank.JACK, suit = Suit.SPADE)).hand(), TwoCardsHand.PAIR)
            }
            it("「ハートのJ」と「ハートの9」の役はフラッシュ") {
                assertEquals(TwoCards(
                        Card(rank = Rank.JACK, suit = Suit.HEART),
                        Card(rank = Rank.NINE, suit = Suit.HEART)).hand(), TwoCardsHand.FLUSH)
            }
            it("「ハートのJ」と「スペ-ドの9」の役はハイカード") {
                assertEquals(TwoCards(
                        Card(rank = Rank.JACK, suit = Suit.HEART),
                        Card(rank = Rank.NINE, suit = Suit.SPADE)).hand(), TwoCardsHand.HIGH_CARD)
            }
        }
    }
})