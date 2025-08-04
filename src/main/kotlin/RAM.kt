import java.io.File
import kotlin.system.exitProcess

object RAM : Memory {

    val memory = IntArray(4096)

    override fun read(address: Int): Int {
        if (address > memory.size) {
            exitProcess(0)
        }
        return memory[address]
    }

    override fun write(address: Int, value: Int) {
        memory[address] = value
    }
}