package chain


//Chain of Responsibility for mocked Restore account
fun main() {
    val handler = ValidationHandler()
    handler.setNextHandler(UserExistsHandler(Database()))

    val restoreAccountService = RestoreAccountService(handler)
    restoreAccountService.restorePassword("jnj","000")
    restoreAccountService.restorePassword("jnj@gmail.com","000")
    restoreAccountService.restorePassword("jnj@gmail.com","0998887642")
    restoreAccountService.restorePassword("user@org.com","0998887642")
    restoreAccountService.restorePassword("user@org.com","0637716721")

}