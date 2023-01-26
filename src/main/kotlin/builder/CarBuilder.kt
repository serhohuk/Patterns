package builder


/**
 * Java style
 * For Kotlin style use apply instead of return this
 */
class CarBuilder : Builder {
    private var speed: Int? = null
    private var seats: Int? = null
    private var name: String? = null
    private var engineType: EngineType? = null

    override fun setName(name: String): Builder {
        this.name = name
        return this
    }

    override fun setSpeed(speed: Int): Builder {
        this.speed = speed
        return this
    }

    override fun setSeats(seats: Int): Builder {
        this.seats = seats
        return this
    }

    override fun setEngineType(type: EngineType): Builder {
        this.engineType = type
        return this
    }

    fun build() = Car(
        name, speed, seats, engineType
    )

}