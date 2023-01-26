package singleton

class SingletonExample {
    companion object {
        private var singletonExample: SingletonExample? = null

        fun getInstance(): SingletonExample {
            if (singletonExample == null) {
                singletonExample = SingletonExample()
            }
            return singletonExample as SingletonExample
        }
    }

    fun work() {
        println("Some work")
    }
}