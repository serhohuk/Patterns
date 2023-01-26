package builder

fun main() {
    val builder: CarBuilder = CarBuilder()
    val director = Director()
    director.constructSportCar(builder)


    val sportCar: Car = builder.build()
    println(sportCar)
}