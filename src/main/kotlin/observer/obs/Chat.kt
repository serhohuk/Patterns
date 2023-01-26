package observer.obs

class Chat: ObservableKt {
    private val messages = mutableListOf<String>()
    private val observers = mutableListOf<ObserverKt>()

    override fun registerObserver(observer: ObserverKt) {
        observers.add(observer)
    }

    override fun unRegisterObserver(observer: ObserverKt) {
        observers.remove(observer)
    }

    fun addMessage(newMessage: String) {
        messages.add(newMessage)
        notifyObservers(newMessage)
    }

    override fun notifyObservers(message: String) {
        for (observer in observers) {
            observer.update(message)
        }
    }

}