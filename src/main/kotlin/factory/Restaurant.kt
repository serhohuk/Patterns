package factory

abstract class Restaurant {

    fun orderPizza(): Pizza {
        val pizza = createPizza()
        pizza.cook()
        return pizza
    }

    abstract fun createPizza() : Pizza
}


//class Restaurant {
//
//}