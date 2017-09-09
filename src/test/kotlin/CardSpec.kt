import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.*

class TwoCardsSpec : Spek({
    describe("カード") {
        on("文字列表記") {
            it("「スペードの3」の文字列表記は「3♠」") {
                assertEquals(Card(rank = Rank.THREE, suit = Suit.SPADE).getNotation(), "3♠")
            }
            it("「ハートのJ」の文字列表記は「J♥」") {
                assertEquals(Card(rank = Rank.JACK, suit = Suit.HEART).getNotation(), "J♥")
            }
        }

        on("同じスートか否か返す") {
            val threeOfSpades = Card(rank = Rank.THREE, suit = Suit.SPADE)

            it("スペードの3とスペードのAは同じスートを持つ") {
                val aceOfSpades = Card(rank = Rank.ACE, suit = Suit.SPADE)
                assertTrue(threeOfSpades hasSameSuit aceOfSpades)
            }
            it("スペードの3とハートのAは異なるスートを持つ") {
                val aceOfHearts = Card(rank = Rank.ACE, suit = Suit.HEART)
                assertFalse(threeOfSpades hasSameSuit aceOfHearts)
            }
        }
        on("同じランクか否かを返す") {
            val aceOfSpades = Card(rank = Rank.ACE, suit = Suit.SPADE)

            it("スペードのAとハートのAは同じランクを持つ") {
                val aceOfHearts = Card(rank = Rank.ACE, suit = Suit.HEART)
                assertTrue(aceOfSpades hasSameRank aceOfHearts)
            }
            it("スペードのAとスペードの3は異なるランクを持つ") {
                val threeOfSpades = Card(rank = Rank.THREE, suit = Suit.SPADE)
                assertFalse(aceOfSpades hasSameRank threeOfSpades)
            }
        }
    }
})

