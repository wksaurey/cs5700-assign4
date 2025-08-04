package Instructions

class ConvertToBase10: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..1).toInt(16)
        print("Convert $rx to base 10 at aaa")
    }
}