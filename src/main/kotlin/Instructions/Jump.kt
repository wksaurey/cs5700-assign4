package Instructions

class Jump: InstructionTemplate() {
    override fun perform(command: String) {
        val aaa = command.toInt(16)
        print("Jump to $aaa")
    }

    override fun incrementP() {
        // noop
    }

}