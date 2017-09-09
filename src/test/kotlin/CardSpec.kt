
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
            it("があること") {
                assertNotNull(Card())
            }
        }

    }
})