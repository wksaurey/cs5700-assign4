package Instructions

class SkipEqual: InstructionTemplate() {
    val skip = false

    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val ry = command.slice(1..1).toInt(16)
        print("Comparing $rx to $ry")
    }

    override fun incrementP() {
        if (skip) {
            CPU.setP(CPU.P+4)
        }
        else {
            CPU.setP(CPU.P+2)
        }
    }
}