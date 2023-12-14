package adapter

fun main() {
    val database : Database = Adapter()
    database.insert()
    database.update()
    database.select()
    database.delete()
}