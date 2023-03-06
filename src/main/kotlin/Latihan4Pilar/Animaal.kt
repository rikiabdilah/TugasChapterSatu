package Latihan4Pilar

class Animal(val name : String, val sound : String){
    fun makeSound(){
        println("${name} says ${sound}")
    }

}

fun main() {
    val animal = Animal("Macan", "Rawwwrrrrr")
    val sound = animal.sound
    animal.makeSound()
}