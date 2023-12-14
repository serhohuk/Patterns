package adapter

interface Database {
    fun insert()
    fun update()
    fun delete()
    fun select()
}