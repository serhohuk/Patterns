package factory

fun main() {
    val pepperoniRestaurant = PepperoniRestaurant()
    println(pepperoniRestaurant.orderPizza())

    val hawaiianRestaurant = HawaiianRestaurant()
    println(hawaiianRestaurant.orderPizza())


    val factory = PizzaFactory()
    val hawaiianPizza = factory.createPizza("hawaiian")
    val pepperoniPizza = factory.createPizza("pepperoni")
    println()
    println(hawaiianPizza)
    println(pepperoniPizza)
}