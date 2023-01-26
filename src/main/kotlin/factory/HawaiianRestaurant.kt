package factory

class HawaiianRestaurant : Restaurant() {
    override fun createPizza(): Pizza {
        return HawaiianPizza()
    }
}