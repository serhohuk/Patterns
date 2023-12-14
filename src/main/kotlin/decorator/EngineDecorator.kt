package decorator

class EngineDecorator(car: Car) : CarDecorator(car) {
    override val model: String
        get() = car.model + " engine"
    override val price: Int
        get() = car.price + 10_000
}