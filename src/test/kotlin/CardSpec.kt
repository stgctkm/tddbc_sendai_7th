
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull

class CardSpec: Spek({
    describe("a card") {
        on("クラス") {
            it("が引数suitとrankをとる") {
                assertNotNull(Card(Suit.SPADE, 3))
            }
        }

        on("文字列表記") {
            it("「スペードの3」の文字列表記は「3♠」") {
                assertEquals(Card(Suit.SPADE, 3).getNotation(), "3♠")
            }
            it("「ハートのJ」の文字列表記は「J♥」") {
                assertEquals(Card(Suit.HEART, 11).getNotation(), "J♥")
            }
        }
    }
})