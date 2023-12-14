package observer.obs

data class User(private val name: String): ObserverKt {
    override fun update(message: String) {
        println("$name received new message -> $message")
    }
}