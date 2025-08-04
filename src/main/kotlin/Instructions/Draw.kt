package Instructions

class Draw: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val ry = command.slice(1..1).toInt(16)
        val rz = command.slice(2..2).toInt(16)
        Display.write(ry*8+rz, CPU.getRegister(rx).toChar())
        print("Drawing the value $rx at row $ry and column $rz")
    }
}