package chain


class UserExistsHandler(private val database: Database): Handler() {

    override fun handle(email: String, phoneNumber: String): Boolean {
        if (!database.userExistByEmail(email)) {
            println("Error this user not in database")
            return false
        }
        if (!database.userPhoneNumberIsCorrect(email, phoneNumber)){
            println("Error this user has another phone number")
            return false
        }
        return handleNext(email, phoneNumber)
    }

}