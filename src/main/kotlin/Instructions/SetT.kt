package Instructions

class SetT: InstructionTemplate() {
    override fun perform(command: String) {
        val bb = command.slice(0..1).toInt(16)
        print("Set T to $bb")
    }
}