package Latihan4Pilar

class Rectangle(val width : Double, val height : Double){
    fun getArea(): Double{
        return width * height
    }

}

fun main() {
    val rectangle = Rectangle(10.0, 5.0)
    val area = rectangle.getArea()
    println("Panjang Luas Persegi Panjang adalah : $area")
}