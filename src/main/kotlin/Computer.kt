import Instructions.InstructionExecuter
import java.io.File
import kotlin.text.toString

object Computer {
    fun initialize() {
        println("Enter path to rom:")
        val filepath = readln()
        ROM.loadROM(filepath)
        run()
    }

    fun run() {
        while (true) {
            val instruction = getInstruction()
            println(instruction)
            InstructionExecuter.execute(instruction)
        }
    }

    fun getInstruction(): String {
        val first = MemoryBus.read(CPU.P)
        val second = MemoryBus.read(CPU.P+1)
        val instruction = (first shl 8) or second
        return instruction.toString(16).padStart(4, '0')
    }

    fun incrementP() {
        CPU.setP(CPU.P + 2)
    }
}