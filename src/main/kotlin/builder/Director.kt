package builder

class Director {
    fun constructSportCar(builder: Builder) {
        builder.setEngineType(EngineType.Sport)
        builder.setSpeed(300)
        builder.setSeats(2)
        builder.setName("McLaren")
    }

    fun constructTractorCar(builder: Builder) {
        builder.setEngineType(EngineType.Tractor)
        builder.setSpeed(50)
        builder.setSeats(1)
        builder.setName("JohnDeer")
    }

    fun constructJeepCar(builder: Builder) {
        builder.setEngineType(EngineType.Jeep)
        builder.setSpeed(200)
        builder.setSeats(6)
        builder.setName("Toyota Rav")
    }
}