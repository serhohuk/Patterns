package chain

abstract class Handler {

    private var nextHandler: Handler? = null

    abstract fun handle(email: String, phoneNumber: String): Boolean

    fun handleNext(email: String, phoneNumber: String): Boolean {
        return if (nextHandler == null) {
            true
        } else {
            nextHandler!!.handle(email, phoneNumber)
        }
    }

    fun setNextHandler(handler: Handler?) : Handler? {
        nextHandler = handler
        return nextHandler
    }
}