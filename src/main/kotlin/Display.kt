object Display {
    val memory: MutableList<Char> = MutableList(64) {' '}

    fun read(address: Int): Char {
        return memory[address]
    }

    fun write(address: Int, value: Char) {
        memory[address] = value
        output()
    }

    private fun output() {
        val frameTop = "┌────────┐"
        val frameSide = "│"
        val frameBottom = "└────────┘"
        print(frameTop)
        memory.forEachIndexed { index, value ->
            val lineBreak =
                if (index == 63) "$frameSide\n"
                else if ((index+1) % 8 == 0) "$frameSide\n$frameSide"
                else ""
            val lineStart =
                if (index == 0) "\n$frameSide"
                else ""
            print("$lineStart$value$lineBreak")
        }
        println(frameBottom)
    }
}