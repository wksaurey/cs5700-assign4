package Instructions

class SetA: InstructionTemplate() {
    override fun perform(command: String) {
        val aaa = command.toInt(16)
        CPU.setA(aaa)
        print("Set A to $aaa")
    }
}