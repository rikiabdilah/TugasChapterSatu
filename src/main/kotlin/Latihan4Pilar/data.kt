package Latihan4Pilar

class User(private val username: String, private val password: String) {

    fun login(inputUsername: String, inputPassword: String): Boolean {
        return username == inputUsername && password == inputPassword
    }
}

fun main() {

    val user = User("admin", "admin123")

    // Memanggil method login() dengan nilai parameter yang sesuai
    println(user.login("admin", "admin123"))

    // Memanggil method login() dengan nilai parameter yang tidak sesuai
    println(user.login("rikiabd", "riki456"))
}
