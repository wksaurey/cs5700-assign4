package Instructions

class ConvertByteToAscii: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val ry = command.slice(1..1).toInt(16)
        print("Convert $rx to ascii at $ry")
    }
}