package Instructions

object InstructionExecuter {
    lateinit var instruction: InstructionTemplate
    fun execute(command: String) {
        when (command[0].digitToInt(16)) {
            0x0 -> instruction = Store()
            0x1 -> instruction = Add()
            0x2 -> instruction = Sub()
            0x3 -> instruction = Read()
            0x4 -> instruction = Write()
            0x5 -> instruction = Jump()
            0x6 -> instruction = ReadKeyboard()
            0x7 -> instruction = SwitchMemory()
            0x8 -> instruction = SkipEqual()
            0x9 -> instruction = SkipNotEqual()
            0xa -> instruction = SetA()
            0xb -> instruction = SetT()
            0xc -> instruction = ReadT()
            0xd -> instruction = ConvertToBase10()
            0xe -> instruction = ConvertByteToAscii()
            0xf -> instruction = Draw()
        }
        instruction.perform(command.slice(1..3))
    }

    fun setInstruction(command: String) {

    }
}