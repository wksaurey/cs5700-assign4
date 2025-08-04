package Instructions

class Draw: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt()
        val ry = command.slice(1..1).toInt()
        val rz = command.slice(2..2).toInt()
        val value = CPU.getRegister(rx).toChar()
        Display.write(ry*8+rz, value)
        print("Drawing the value $rx at row $ry and column $rz")
    }
}