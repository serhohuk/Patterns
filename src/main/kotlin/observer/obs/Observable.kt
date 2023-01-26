package observer.obs

interface ObservableKt {
    fun registerObserver(observer: ObserverKt)
    fun unRegisterObserver(observer: ObserverKt)
    fun notifyObservers(message: String)
}