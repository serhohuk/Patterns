package decorator

class WheelsDecorator(car: Car) : CarDecorator(car) {
    override val model: String
        get() = car.model + " wheels"
    override val price: Int
        get() = car.price + 5_000
}