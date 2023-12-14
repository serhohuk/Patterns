package decorator

class AudiCar(override val model: String, override val price: Int) : Car {
    override fun toString(): String {
        return "$model $price"
    }
}