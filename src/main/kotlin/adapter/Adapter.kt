package adapter

class Adapter : AppWithDb(), Database {
    override fun insert() {
        saveObject()
    }

    override fun update() {
        updateObject()
    }

    override fun delete() {
        deleteObject()
    }

    override fun select() {
        loadObject()
    }

}