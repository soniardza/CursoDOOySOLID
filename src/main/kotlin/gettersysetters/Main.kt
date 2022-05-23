package gettersysetters

import java.time.LocalDate
import java.time.Month

fun main() {

    // User
    // - email
    // - password
    // - birthdate
    // - gender

    // register(user) -- caso de uso
    val user = User("SONIA@GMAIL.COM", "abc123")
    val userRegister: User? = RegisterUser().invoke(user)

    if (userRegister != null) {
        println("User email: ${userRegister.email}")
        println("User password: ${userRegister.password}")
    } else {
        println("User Not Registered")
    }

    println()

    val secondUser =User(
        email = "sony@gmail.com",
        password = "123abc",
        birthdate = LocalDate.of(1990, Month.MAY, 23),
        gender = 'F'
    )

    val secondUserRegistered: User? = RegisterUser().invoke(secondUser)

    if (secondUserRegistered != null) {
        println("User email: ${secondUserRegistered.email}")
        println("User password: ${secondUserRegistered.password}")
        println("User birthday: ${secondUserRegistered.birthdate}")
        println("User gender: ${secondUserRegistered.gender}")
    } else {
        println("User Not Registered")
    }

}