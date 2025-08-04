package Instructions

class ReadKeyboard: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        println("Waiting for keyboard input:")
        val input = readln().toInt(16)
        CPU.setRegister(rx, input)
        print("Reading $input from keyboard and storing in $rx")
    }
}