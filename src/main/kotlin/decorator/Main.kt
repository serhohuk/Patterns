package decorator

fun main() {
    val audi = AudiCar("Audi", 70_000)
    println(audi)
    val wheels = WheelsDecorator(audi)
    println(wheels.model + " " + wheels.price)
    val engines = EngineDecorator(wheels)
    println(engines.model + " " + engines.price)
}