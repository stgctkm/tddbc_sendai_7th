
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.*

class CardSpec: Spek({
    describe("a card") {
        on("クラス") {
            it("が引数suitとrankをとる") {
                assertNotNull(Card(Suit.SPADE, Rank.THREE))
            }
        }

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
            val aceOfSpades = Card(Suit.SPADE, Rank.ACE)
            val aceOfHearts = Card(Suit.HEART, Rank.ACE)

            it ("スペードの3とスペードのAは同じスートを持つ") {
                assertTrue(threeOfSpades hasSameSuit aceOfSpades)
            }
            it ("スペードの3とハートのAは異なるスートを持つ") {
                assertFalse (threeOfSpades hasSameSuit aceOfHearts)
            }
        }
        on("同じランクか否かを返す") {
            val threeOfSpades = Card(Suit.SPADE, Rank.THREE)
            val aceOfSpades = Card(Suit.SPADE, Rank.ACE)
            val aceOfHearts = Card(Suit.HEART, Rank.ACE)

            it ("スペードの3とスペードのAは異なるランクを持つ") {
                assertFalse(threeOfSpades hasSameRank aceOfSpades)
            }
            it ("スペードのAとハートのAは同じランクを持つ") {
                assertTrue(aceOfSpades hasSameRank aceOfHearts)
            }
        }

    }
})

