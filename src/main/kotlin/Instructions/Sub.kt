package Instructions

class Sub: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val ry = command.slice(1..1).toInt(16)
        val rz = command.slice(2..2).toInt(16)
        print("Subtracting $ry from $rx at $rz")
    }
}