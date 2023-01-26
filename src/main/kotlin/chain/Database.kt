package chain

class Database {
    private val users = mapOf<String, String>(
        "test@org.com" to "0996661488",
        "user@org.com" to "0637716721",
        "acc@org.com" to "0981011022"
    )

    fun userExistByEmail(value: String): Boolean {
        return users.containsKey(value)
    }

    fun userPhoneNumberIsCorrect(value: String, phoneNumber: String): Boolean {
        return users[value] == phoneNumber
    }

}