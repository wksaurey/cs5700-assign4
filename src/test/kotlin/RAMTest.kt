import RAM
import kotlin.test.Test
import kotlin.test.assertEquals

class RAMTest {
    @Test
    fun testReadWrite() {
        val indices = listOf(5, 4, 6, 7, 23, 1000, 4095)
        val values = listOf(29, 29045, 952, 250, 0, 245, 6576)
        RAM.write(10, 3)
        assertEquals(3, RAM.read(10))
    }
}