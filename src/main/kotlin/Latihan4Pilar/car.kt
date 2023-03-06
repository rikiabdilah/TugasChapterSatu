package Latihan4Pilar

open class Vehicle(val brand: String, val color: String) {

}

class Car(brand: String, color: String) : Vehicle(brand, color) {

    fun drive(): String {
        return "Driving $brand"
    }
}

class Motorcycle(brand: String, color: String) : Vehicle(brand, color) {
    fun drive(): String {
        return "Driving $brand"
    }
}

fun main() {

    val car = Car("Toyota", "Silver")
    println(car.drive())

    val motorcycle = Motorcycle("Honda", "Red")
}




