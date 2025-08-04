package Instructions

class ReadKeyboard: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        print("Reading keyboard and storing in $rx")
    }
}