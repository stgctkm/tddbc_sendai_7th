
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.*

class CardSpec: Spek({
    describe("カード") {
        on("文字列表記") {
            it("「スペードの3」の文字列表記は「3♠」") {
                assertEquals(Card(Suit.SPADE, Rank.THREE).getNotation(), "3♠")
            }
            it("「ハートのJ」の文字列表記は「J♥」") {
                assertEquals(Card(Suit.HEART, Rank.JACK).getNotation(), "J♥")
            }
        }

        on ("同じスートか否か返す") {
            val threeOfSpades = Card(Suit.SPADE, Rank.THREE)

            it ("スペードの3とスペードのAは同じスートを持つ") {
                val aceOfSpades = Card(Suit.SPADE, Rank.ACE)
                assertTrue(threeOfSpades hasSameSuit aceOfSpades)
            }
            it ("スペードの3とハートのAは異なるスートを持つ") {
                val aceOfHearts = Card(Suit.HEART, Rank.ACE)
                assertFalse (threeOfSpades hasSameSuit aceOfHearts)
            }
        }
        on("同じランクか否かを返す") {
            val aceOfSpades = Card(Suit.SPADE, Rank.ACE)

            it ("スペードのAとハートのAは同じランクを持つ") {
                val aceOfHearts = Card(Suit.HEART, Rank.ACE)
                assertTrue(aceOfSpades hasSameRank aceOfHearts)
            }
            it ("スペードのAとスペードの3は異なるランクを持つ") {
                val threeOfSpades = Card(Suit.SPADE, Rank.THREE)
                assertFalse( aceOfSpades hasSameRank threeOfSpades)
            }
        }
   }
})

