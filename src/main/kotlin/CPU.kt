object CPU {
    private val R = MutableList(7) {0}
    var P = 0
        private set
    var T = 0
        private set
    var A = 0
        private set
    var M = 0
        private set

    fun getRegister(index: Int): Int {
        return R[index]
    }

    fun setRegister(index: Int, value: Int) {
        R[index] = value
    }

    fun setP(value: Int) {
        if (value % 2 != 0) {
            throw IllegalArgumentException("Program Counter must be an even number")
        }
        P = value
    }

    fun setT(value: Int) {
        T = value
    }

    fun setA(value: Int) {
        A = value
    }

    fun toggleM() {
        M =
            if (M == 0) 1
            else 0
    }
}