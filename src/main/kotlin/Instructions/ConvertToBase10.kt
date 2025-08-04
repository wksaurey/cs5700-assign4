package Instructions

class ConvertToBase10: InstructionTemplate() {
    override fun perform(command: String) {
        val rx = command.slice(0..0).toInt(16)
        val value = CPU.getRegister(rx).toString().padStart(3, '0')
        RAM.write(CPU.A, value[0].digitToInt())
        RAM.write(CPU.A+1, value[1].digitToInt())
        RAM.write(CPU.A+2, value[2].digitToInt())
        print("Convert $value to base 10 at aaa")
    }
}