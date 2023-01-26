package chain

import java.util.regex.Pattern

class ValidationHandler : Handler() {

    override fun handle(email: String, phoneNumber: String): Boolean {
        if (!isEmailValid(email)){
            println("Email is incorrect")
            println("check it again $email")
            return false
        }
        if (!isNumberValid(phoneNumber)) {
            println("phoneNumber is incorrect")
            println("check it again $phoneNumber")
            return false
        }
        return handleNext(email, phoneNumber)
    }

    private fun isEmailValid(email: String) = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$").matcher(email).matches()

    private fun isNumberValid(phoneNumber: String) = Pattern.compile("^\\d{10}$").matcher(phoneNumber).matches()


}

fun main() {
    println(Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$").matcher("sajnda").matches())
}