package factory

class PizzaFactory {

    fun createPizza(type: String): Pizza {
        return when(type) {
            "pepperoni" -> PepperoniPizza()
            "hawaiian" -> HawaiianPizza()
            else -> throw IllegalArgumentException("unknown pizza type")
        }
    }
}