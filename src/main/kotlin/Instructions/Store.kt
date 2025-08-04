package Instructions

class Store: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        val bb = command.slice(1..2).toInt(16)
        print("Storing $bb $rx")
    }
}