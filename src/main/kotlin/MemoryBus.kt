object MemoryBus: Memory {
    override fun read(address: Int): Int {
        return if (CPU.M == 0) {
            ROM.read(address)
        } else {
            RAM.read(address)
        }
    }

    override fun write(address: Int, value: Int) {
        if (CPU.M == 0) {
            ROM.write(address, value)
        }
        else {
            RAM.write(address, value)
        }
    }
}