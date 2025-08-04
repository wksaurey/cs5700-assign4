package Instructions

class Read: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        print("Reading from $rx")
    }
}