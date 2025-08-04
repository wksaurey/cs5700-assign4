package Instructions

class Add: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val ry = command.slice(1..1).toInt(16)
        val rz = command.slice(2..2).toInt(16)
        val addend1 = CPU.getRegister(rx)
        val addend2 = CPU.getRegister(ry)
        val sum = addend1 + addend2
        CPU.setRegister(rz, sum)
        print("Adding $addend1 to $addend2 at $rz")
    }

}