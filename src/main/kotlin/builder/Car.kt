package builder

data class Car(
    val name: String?,
    val maxSpeed: Int?,
    val seats: Int?,
    val engine: EngineType?
)

enum class EngineType {
    Sport, Tractor, Jeep
}