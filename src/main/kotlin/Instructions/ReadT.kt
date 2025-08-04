package Instructions

class ReadT: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        print("Reading T to $rx")
    }
}