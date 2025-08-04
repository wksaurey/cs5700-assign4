package Instructions

abstract class InstructionTemplate {
    abstract fun perform(command: String)
    protected open fun incrementP() {
        CPU.setP(CPU.P + 2)
    }
}