package observer

import observer.obs.Chat
import observer.obs.User

fun main() {
    //Java observer
//    val gameNewsAgency = GameNewsAgency()
//    gameNewsAgency.registerObserver(Subscriber("Subs1"))
//    gameNewsAgency.registerObserver(Subscriber("Subs2"))
//    gameNewsAgency.registerObserver(Subscriber("Subs3"))
//
//    gameNewsAgency.setNewsAgency("Stalker 2 release 2022")
//    gameNewsAgency.setNewsAgency("Stalker 2 release updated")
//    gameNewsAgency.setNewsAgency("Stalker 2 price will be 800 UAH")

    //Kt Observer
    val groupChat = Chat()
    groupChat.registerObserver(User("Messi"))
    groupChat.registerObserver(User("Ronaldo"))
    groupChat.registerObserver(User("Suarez"))

    groupChat.addMessage("Hello everyone")

    groupChat.unRegisterObserver(User("Ronaldo"))

    groupChat.addMessage("Ronaldo left chat")
}
