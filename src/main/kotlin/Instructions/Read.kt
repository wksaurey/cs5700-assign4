package Instructions

class Read: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val value = RAM.read(CPU.A)
        CPU.setRegister(rx, value)
        print("Reading $value to $rx")
    }
}