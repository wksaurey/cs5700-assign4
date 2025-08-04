package Instructions

class Write: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        print("Writing $rx to A")
    }
}