package LatihanSolid


abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double) : Shape(name) {
    override fun area() = Math.PI * radius * radius
}

class Square(name: String, val side: Double) : Shape(name) {
    override fun area() = side * side
}

class ShapePrinter {
    // Metode untuk mencetak informasi bentuk
    fun print(shape: Shape) {
        println("${shape.name} memiliki luas ${shape.area()}")
    }
}

fun main() {
    // Membuat objek-objek bentuk
    val circle = Circle("Lingkaran", 5.0)
    val square = Square("Persegi", 7.0)

    // Membuat objek ShapePrinter
    val shapePrinter = ShapePrinter()

    // Mencetak informasi luas bentuk
    shapePrinter.print(circle)
    shapePrinter.print(square)
}
