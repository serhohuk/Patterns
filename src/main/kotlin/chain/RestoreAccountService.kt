package chain


class RestoreAccountService(private val handler: Handler?) {

    fun restorePassword(email: String, phoneNumber: String): Boolean {
        if (handler?.handle(email, phoneNumber) == true) {
            println("Restore password successful")
            return true
        }
        return false
    }
}