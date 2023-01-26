package builder

interface Builder {
    fun setName(name: String): Builder
    fun setSpeed(speed: Int): Builder
    fun setSeats(seats: Int): Builder
    fun setEngineType(type: EngineType): Builder
}