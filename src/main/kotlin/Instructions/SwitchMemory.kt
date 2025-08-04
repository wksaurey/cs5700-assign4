package Instructions

class SwitchMemory: InstructionTemplate() {
    override fun perform(command: String) {
        println("Switching memory device")
        CPU.toggleM()
    }
}