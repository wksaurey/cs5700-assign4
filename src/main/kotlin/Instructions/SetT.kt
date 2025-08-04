package Instructions

class SetT: InstructionTemplate() {
    override fun perform(command: String) {
        val bb = command.slice(0..2).toInt(16)
        print("Set T to $bb")
    }
}