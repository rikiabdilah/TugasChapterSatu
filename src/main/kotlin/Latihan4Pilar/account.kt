package Latihan4Pilar

class Person(val name: String, val age: Int, private val address: String) {

    fun getDetails(): String {
        return "Name: $name, Age: $age, Address: $address"
    }
}

fun main() {
    val person = Person("Riki", 21, "Cilincing Bhakti")


    println(person.getDetails())
}