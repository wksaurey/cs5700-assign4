package Instructions

class Add: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        val ry = command.slice(1..2).toInt(16)
        val rz = command.slice(2..3).toInt(16)
        print("Adding $rx to $ry at $rz")
    }

}