package Instructions

class Store: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val bb = command.slice(1..2).toInt(16)
        CPU.setRegister(rx, bb)
        print("Storing $bb $rx")
    }
}