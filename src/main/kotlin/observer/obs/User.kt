package observer.obs

//class User(private val name: String): ObserverKt {
//    override fun update(message: String) {
//        println("$name received new message -> $message")
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is User) {
//            return this.name == other.name
//        }
//        return false
//    }
//
//    override fun hashCode(): Int {
//        var result = 5
//        result = 17 * result + name.hashCode()
//        return result
//    }
//}

data class User(private val name: String): ObserverKt {
    override fun update(message: String) {
        println("$name received new message -> $message")
    }
}