import java.io.File
import kotlin.system.exitProcess

object ROM : Memory {

    val memory = mutableListOf<Int>()

    fun loadROM(filepath: String) {
        val file = File(filepath)
        val romBytes = file.readBytes()

        for (i in romBytes.indices step 2) {
            val high = romBytes[i].toInt() and 0xFF
            val low = romBytes[i + 1].toInt() and 0xFF
            val instruction = (high shl 8) or low
            val fullInstruction = instruction.toString(16).padStart(4, '0').slice(0..2)
            memory.add(high)
            memory.add(low)
        }

        for (instruction in memory) {
            println(instruction.toString(16).padStart(2, '0'))
        }
    }

    override fun read(address: Int): Int {
        if (address >= memory.size) {
            exitProcess(0)
        }
        return memory[address]
    }

    override fun write(address: Int, value: Int) {
        throw IllegalCallerException("Unable to write to ROM")
    }
}