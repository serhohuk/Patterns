package factory

class PepperoniRestaurant : Restaurant() {
    override fun createPizza(): Pizza {
        return PepperoniPizza()
    }
}