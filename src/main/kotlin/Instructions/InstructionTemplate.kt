package Instructions

abstract class InstructionTemplate {
    abstract fun perform(command: String)
    open fun incrementP() {
        CPU.setP(CPU.P + 2)
    }
}